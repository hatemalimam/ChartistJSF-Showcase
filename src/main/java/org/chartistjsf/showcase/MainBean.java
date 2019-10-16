package org.chartistjsf.showcase;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.util.Base64;

import com.ocpsoft.shade.org.apache.commons.logging.Log;
import com.ocpsoft.shade.org.apache.commons.logging.LogFactory;

@ManagedBean
@ViewScoped
public class MainBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3865860455560848985L;

	protected Log log = LogFactory.getLog(this.getClass());

	private String currentSection;

	/**
	 * Main navigation - xhtml path passed from here
	 * */
	public void updateSection() {
		try {
			currentSection = new String(Base64.decodeFast(getRequestParameter("currentSection")), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			log.error("Application is broken, porka Vacca");
		}
	}

	public static String getRequestParameter(String name) {
		return FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get(name);
	}

	/**
	 * @return the currentSection
	 */
	public String getCurrentSection() {
		return currentSection;
	}

	/**
	 * @param currentSection
	 *            the currentSection to set
	 */
	public void setCurrentSection(String currentSection) {
		this.currentSection = currentSection;
	}

}
