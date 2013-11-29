import org.openmrs.module.web.extension.PatientDashboardTabExt;

/**
 * Created with IntelliJ IDEA.
 * User: tika
 * Date: 11/28/13
 * Time: 10:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class DashboardtabExtensionController extends PatientDashboardTabExt {

    /**
     * @see org.openmrs.module.web.extension.PatientDashboardTabExt#getPortletUrl()
     */
    @Override
    public String getPortletUrl() {
        return "antecedentespersonalesPacienteView";
    }
    /**
     * @see org.openmrs.module.web.extension.PatientDashboardTabExt#getTabId()
     */
    @Override
    public String getTabId() {
        return "Module dashboardtab";
    }
    /**
     * @see org.openmrs.module.web.extension.PatientDashboardTabExt#getTabName()
     */
    @Override
    public String getTabName() {
        return "Print Patient ID Card";
    }

    public String getRequiredPrivilege(){

        return "";
    }
}
