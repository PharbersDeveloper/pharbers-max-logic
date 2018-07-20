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

    case class msg_getNationSaleShare(data: JsValue) extends msg_DashboardCommand
    case class msg_getNationMarketTrend(data: JsValue) extends msg_DashboardCommand
    case class msg_getNationMostWord(data: JsValue) extends msg_DashboardCommand
    case class msg_getNationProductShare(data: JsValue) extends msg_DashboardCommand
    case class msg_getNationProductRank(data: JsValue) extends msg_DashboardCommand
    case class msg_getNationProductTable(data: JsValue) extends msg_DashboardCommand

    case class msg_getProvinceAll(data: JsValue) extends msg_DashboardCommand
    case class msg_getProvinceProvinceName(data: JsValue) extends msg_DashboardCommand
    case class msg_getProvinceLineOverview(data: JsValue) extends msg_DashboardCommand
    case class msg_getProvinceTableOverview(data: JsValue) extends msg_DashboardCommand
    case class msg_getProvinceMarketPart(data: JsValue) extends msg_DashboardCommand
    case class msg_getProvinceProvLevelRank(data: JsValue) extends msg_DashboardCommand
    case class msg_getProvinceProvMarketSale(data: JsValue) extends msg_DashboardCommand
    case class msg_getProvinceProductTrend(data: JsValue) extends msg_DashboardCommand
    case class msg_getProvinceProductCard(data: JsValue) extends msg_DashboardCommand
    case class msg_getProvinceProductShare(data: JsValue) extends msg_DashboardCommand
    case class msg_getProvinceProdRankChange(data: JsValue) extends msg_DashboardCommand
    case class msg_getProvinceProdSaleOverview(data: JsValue) extends msg_DashboardCommand
    case class msg_getProvinceProdTrendAnalysis(data: JsValue) extends msg_DashboardCommand

}
