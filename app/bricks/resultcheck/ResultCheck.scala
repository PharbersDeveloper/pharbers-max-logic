package bricks.resultcheck

import com.pharbers.builder.search.ShowResultCheck
import com.pharbers.jsonapi.json.circe.CirceJsonapiSupport
import com.pharbers.jsonapi.model
import com.pharbers.macros._
import com.pharbers.macros.convert.jsonapi.JsonapiMacro._
import com.pharbers.pattern.frame._
import module.resultcheck.resultcheck
import play.api.mvc.Request

/**
  * @ ProjectName pharbers-client.bricks.samplecheck.SampleCheckSelecter
  * @ author jeorch
  * @ date 18-9-26
  * @ Description: TODO
  */
case class ResultCheck()(implicit val rq: Request[model.RootObject])
    extends Brick with CirceJsonapiSupport {

    override val brick_name: String = "get sample check selecter data"

    var rc_data: resultcheck = new resultcheck()

    override def prepare: Unit = rc_data = formJsonapi[resultcheck](rq.body)

    override def exec: Unit = {
        val ssc = new ShowResultCheck
        val company_id = rc_data.company_id
        val ym = rc_data.ym
        val market = rc_data.market
        val (indicators, trend, region, mirror) = ssc.searchResultCheck(company_id, ym, market)
        rc_data.indicators = indicators
        rc_data.trend = trend
        rc_data.region = region
        rc_data.mirror = mirror
    }

    override def goback: model.RootObject = toJsonapi(rc_data)
}