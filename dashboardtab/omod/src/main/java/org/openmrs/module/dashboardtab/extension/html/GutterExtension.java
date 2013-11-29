package org.openmrs.module.dashboardtab.extension.html;

import org.openmrs.module.web.extension.LinkExt;

/**
 * Created with IntelliJ IDEA.
 * User: tika
 * Date: 11/28/13
 * Time: 11:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class GutterExtension {

    public class GutterListExt extends LinkExt {

        String urlg = "";
        String label = "";

        public String getLabel() {
            label = "Dashboard Tab";
            return this.label;
        }

        public String getUrl() {
            urlg = "/module/dashboardtab/dashboardtabforid.form";
            return this.urlg;
        }

        /**
         * Returns the required privilege in order to see this section. Can be a
         * comma delimited list of privileges. If the default empty string is
         * returned, only an authenticated user is required
         *
         * @return Privilege string
         */
        public String getRequiredPrivilege() {
            return "";
        }

    }
}
