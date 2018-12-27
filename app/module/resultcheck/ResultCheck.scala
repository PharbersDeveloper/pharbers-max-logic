package module.resultcheck

import com.pharbers.macros.api.commonEntity
import com.pharbers.macros.common.connecting.ToStringMacro

/**
  * @ ProjectName pharbers_max_client.module.samplecheck.tmp
  * @ author jeorch
  * @ date 18-9-26
  * @ Description: TODO
  */
@ToStringMacro
class ResultCheck extends commonEntity {
    type phase = Map[String, Any]

    var job_id: String = ""
    var user_id: String = ""
    var company_id: String = ""
    var ym: String = ""
    var market: String = ""
    var indicators: phase = Map.empty
    var trend: List[phase] = Nil
    var region: List[phase] = Nil
    var mirror: phase = Map.empty
}
