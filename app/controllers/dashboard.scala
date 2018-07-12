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

}
