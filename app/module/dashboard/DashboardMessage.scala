package module.dashboard

import com.pharbers.bmmessages.CommonMessage
import play.api.libs.json.JsValue

/**
  * Created by jeorch on 18-6-7.
  */
abstract class msg_DashboardCommand extends CommonMessage("dashboard", DashboardModule)

object DashboardMessage {

    case class msg_getSaleData(data: JsValue) extends msg_DashboardCommand
    case class msg_getKeyWord(data: JsValue) extends msg_DashboardCommand
    case class msg_getOverView(data: JsValue) extends msg_DashboardCommand
    case class msg_getContribution(data: JsValue) extends msg_DashboardCommand

}
