package module.samplecheck

import com.pharbers.macros.api.commonEntity
import com.pharbers.macros.common.connecting.ToStringMacro

/**
  * @ ProjectName pharbers-client.module.samplecheck.samplecheckselecter
  * @ author jeorch
  * @ date 18-9-26
  * @ Description: TODO
  */

@ToStringMacro
class SampleCheckBody extends commonEntity {
    type phase = Map[String, Any]

    var job_id: String = ""
    var user_id: String = ""
    var company_id: String = ""
    var ym: String = ""
    var market: String = ""
    var hospital: phase = Map.empty
    var product: phase = Map.empty
    var sales: phase = Map.empty
    var notfindhospital: List[phase] = Nil
}
