package org.openmrs.module.dashboardtab.extension.html;

import org.openmrs.module.Extension;
import org.openmrs.module.web.extension.PatientDashboardTabExt;

/**
 * Created with IntelliJ IDEA.
 * User: tika
 * Date: 11/28/13
 * Time: 10:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class DashboardTabForID  extends PatientDashboardTabExt {

        /**
         * @see org.openmrs.module.web.extension.PatientDashboardTabExt#getPortletUrl()
         */

        public Extension.MEDIA_TYPE getMediaType() {
            return Extension.MEDIA_TYPE.html;
        }
        @Override
        public String getPortletUrl() {
            return "dashboardtabforid";
        }
        /**
         * @see org.openmrs.module.web.extension.PatientDashboardTabExt#getTabId()
         */
        @Override
        public String getTabId() {
            return "dashboardtabforid";
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


