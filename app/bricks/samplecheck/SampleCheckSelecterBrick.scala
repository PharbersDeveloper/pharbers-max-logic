package bricks.samplecheck

import com.pharbers.builder.search.ShowSampleCheckSelecter
import com.pharbers.jsonapi.json.circe.CirceJsonapiSupport
import com.pharbers.jsonapi.model
import com.pharbers.macros._
import com.pharbers.macros.convert.jsonapi.JsonapiMacro._
import com.pharbers.pattern.frame._
import module.samplecheck.SampleCheckSelecter
import play.api.mvc.Request

/**
  * @ ProjectName pharbers-client.bricks.samplecheck.SampleCheckSelecter
  * @ author jeorch
  * @ date 18-9-26
  * @ Description: TODO
  */
case class SampleCheckSelecterBrick()(implicit val rq: Request[model.RootObject])
    extends Brick with CirceJsonapiSupport {

    override val brick_name: String = "get sample check selecter data"

    var scs_data: SampleCheckSelecter = new SampleCheckSelecter()

    override def prepare: Unit = scs_data = formJsonapi[SampleCheckSelecter](rq.body)

    override def exec: Unit = {
        val sscs = new ShowSampleCheckSelecter
        val job_id = scs_data.job_id
        val company_id = scs_data.company_id
        val (ymLst, mktLst) = sscs.getYmsAndMkts(job_id, company_id)
        scs_data.ym_list = ymLst
        scs_data.mkt_list = mktLst
    }

    override def goback: model.RootObject = toJsonapi(scs_data)
}