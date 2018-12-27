package bricks.samplecheck

import com.pharbers.builder.search.{ShowSampleCheck, ShowSampleCheckSelecter}
import com.pharbers.jsonapi.json.circe.CirceJsonapiSupport
import com.pharbers.jsonapi.model
import com.pharbers.macros._
import com.pharbers.macros.convert.jsonapi.JsonapiMacro._
import com.pharbers.pattern.frame._
import module.samplecheck.{SampleCheckBody, SampleCheckSelecter}
import play.api.mvc.Request

/**
  * @ ProjectName pharbers-client.bricks.samplecheck.SampleCheckSelecter
  * @ author jeorch
  * @ date 18-9-26
  * @ Description: TODO
  */
case class SampleCheckBodyBrick()(implicit val rq: Request[model.RootObject])
    extends Brick with CirceJsonapiSupport {

    override val brick_name: String = "get sample check selecter data"

    var scb_data: SampleCheckBody = new SampleCheckBody()

    override def prepare: Unit = scb_data = formJsonapi[SampleCheckBody](rq.body)

    override def exec: Unit = {
        val ssc = new ShowSampleCheck
        val user_id = scb_data.user_id
        val company_id = scb_data.company_id
        val ym = scb_data.ym
        val market = scb_data.market
        val (hospital, product, sales, notfindhospital) = ssc.searchSimpleCheck(user_id, company_id, ym, market)
        scb_data.hospital = hospital
        scb_data.product = product
        scb_data.sales = sales
        scb_data.notfindhospital = notfindhospital
    }

    override def goback: model.RootObject = toJsonapi(scb_data)
}