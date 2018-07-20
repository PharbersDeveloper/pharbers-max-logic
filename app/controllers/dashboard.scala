package controllers

import javax.inject.Inject

import akka.actor.ActorSystem
import com.pharbers.bmmessages.{CommonModules, MessageRoutes}
import com.pharbers.bmpattern.LogMessage.msg_log
import com.pharbers.bmpattern.ResultMessage.msg_CommonResultMessage
import com.pharbers.dbManagerTrait.dbInstanceManager
import com.pharbers.module.{MAXCallJobPusher, MAXResponseConsumer}
import com.pharbers.token.AuthTokenTrait
import controllers.common.requestArgsQuery
import module.dashboard.DashboardMessage._
import module.users.UserMessage.{msg_expendCompanyInfo, msg_queryUser}
import play.api.libs.json.Json.toJson
import play.api.mvc.Action

class dashboard @Inject()(as_inject: ActorSystem, dbt: dbInstanceManager, att: AuthTokenTrait, cp: MAXCallJobPusher, rc: MAXResponseConsumer) {
    implicit val as: ActorSystem = as_inject

    import com.pharbers.bmpattern.LogMessage.common_log
    import com.pharbers.bmpattern.ResultMessage.common_result

    def getSaleData = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getSaleData"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getSaleData(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getKeyWord = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getKeyWord"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getKeyWord(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getOverView = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getOverView"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getOverView(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getContribution = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getContribution"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getContribution(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getNationSaleShare = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getNationSaleShare"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getNationSaleShare(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getNationMarketTrend = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getNationMarketTrend"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getNationMarketTrend(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getNationMostWord = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getNationMostWord"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getNationMostWord(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getNationProductShare = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getNationProductShare"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getNationProductShare(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getNationProductRank = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getNationProductRank"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getNationProductRank(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getNationProductTable = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getNationProductTable"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getNationProductTable(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getProvinceAll = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getProvinceAll"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getProvinceAll(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getProvinceProvinceName = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getProvinceProvinceName"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getProvinceProvinceName(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getProvinceLineOverview = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getProvinceLineOverview"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getProvinceLineOverview(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getProvinceTableOverview = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getProvinceTableOverview"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getProvinceTableOverview(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getProvinceMarketPart = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getProvinceMarketPart"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getProvinceMarketPart(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getProvinceProvLevelRank = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getProvinceProvLevelRank"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getProvinceProvLevelRank(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getProvinceProvMarketSale = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getProvinceProvMarketSale"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getProvinceProvMarketSale(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getProvinceProductTrend = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getProvinceProductTrend"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getProvinceProductTrend(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getProvinceProductCard = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getProvinceProductCard"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getProvinceProductCard(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getProvinceProductShare = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getProvinceProductShare"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getProvinceProductShare(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getProvinceProdRankChange = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getProvinceProdRankChange"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getProvinceProdRankChange(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getProvinceProdSaleOverview = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getProvinceProdSaleOverview"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getProvinceProdSaleOverview(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

    def getProvinceProdTrendAnalysis = Action(request => requestArgsQuery().requestArgs(request) { jv =>
        MessageRoutes(msg_log(toJson(Map("method" -> toJson("getProvinceProdTrendAnalysis"))), jv)
            :: msg_queryUser(jv)
            :: msg_expendCompanyInfo(jv)
            :: msg_getProvinceProdTrendAnalysis(jv)
            :: msg_CommonResultMessage() :: Nil, None)(CommonModules(Some(Map("db" -> dbt, "att" -> att, "cp" -> cp))))
    })

}
