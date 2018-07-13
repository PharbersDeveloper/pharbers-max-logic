package module.dashboard

import com.pharbers.bmmessages.{CommonModules, MessageDefines}
import com.pharbers.bmpattern.ModuleTrait
import com.pharbers.builder.DashboardFacade
import module.common.MergeStepResult
import module.dashboard.DashboardMessage._
import play.api.libs.json.JsValue

/**
  * Created by jeorch on 18-6-7.
  */
object DashboardModule extends ModuleTrait {

    val dashboard = new DashboardFacade

    def dispatchMsg(msg: MessageDefines)(pr: Option[Map[String, JsValue]])
                   (implicit cm: CommonModules): (Option[Map[String, JsValue]], Option[JsValue]) = msg match {

        case msg_getSaleData(data) => dashboard.saleData(MergeStepResult(data, pr))
        case msg_getKeyWord(data) => dashboard.keyWord(MergeStepResult(data, pr))
        case msg_getOverView(data) => dashboard.overView(MergeStepResult(data, pr))
        case msg_getContribution(data) => dashboard.contribution(MergeStepResult(data, pr))
    }

}
