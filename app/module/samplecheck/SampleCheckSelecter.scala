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
class SampleCheckSelecter extends commonEntity {
    var job_id: String = ""
    var company_id: String = ""
    var ym_list: List[String] = Nil
    var mkt_list: List[String] = Nil
}
