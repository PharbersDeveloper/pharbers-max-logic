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

        case msg_getNationSaleShare(data) => dashboard.getNationSaleShare(MergeStepResult(data, pr))
        case msg_getNationMarketTrend(data) => dashboard.getNationMarketTrend(MergeStepResult(data, pr))
        case msg_getNationMostWord(data) => dashboard.getNationMostWord(MergeStepResult(data, pr))
        case msg_getNationProductShare(data) => dashboard.getNationProductShare(MergeStepResult(data, pr))
        case msg_getNationProductRank(data) => dashboard.getNationProductRank(MergeStepResult(data, pr))
        case msg_getNationProductTable(data) => dashboard.getNationProductTable(MergeStepResult(data, pr))

        case msg_getProvinceAll(data) => dashboard.getProvinceLst(MergeStepResult(data, pr))
        case msg_getProvinceProvinceName(data) => dashboard.getProvinceCardData(MergeStepResult(data, pr))
        case msg_getProvinceLineOverview(data) => dashboard.getProvinceLineOverview(MergeStepResult(data, pr))
        case msg_getProvinceTableOverview(data) => dashboard.getProvinceTableOverview(MergeStepResult(data, pr))
        case msg_getProvinceMarketPart(data) => dashboard.getProvinceMarketPart(MergeStepResult(data, pr))
        case msg_getProvinceProvLevelRank(data) => dashboard.getProvLevelRank(MergeStepResult(data, pr))
        case msg_getProvinceProvMarketSale(data) => dashboard.getProvMarketSale(MergeStepResult(data, pr))
        case msg_getProvinceProductTrend(data) => dashboard.getProvProdTrend(MergeStepResult(data, pr))
        case msg_getProvinceProductCard(data) => dashboard.getProvProdCard(MergeStepResult(data, pr))
        case msg_getProvinceProductShare(data) => dashboard.getProvProdShare(MergeStepResult(data, pr))
        case msg_getProvinceProdRankChange(data) => dashboard.getProvProdRankChange(MergeStepResult(data, pr))
        case msg_getProvinceProdSaleOverview(data) => dashboard.getProvProdSaleOverview(MergeStepResult(data, pr))
        case msg_getProvinceProdTrendAnalysis(data) => dashboard.getProvProdTrendAnalysis(MergeStepResult(data, pr))
    }

}
