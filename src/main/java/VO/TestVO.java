package VO;

import java.io.Serializable;

public class TestVO implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String measurePointName;

	public String getMeasurePointName() {
		return measurePointName;
	}

	public void setMeasurePointName(String measurePointName) {
		this.measurePointName = measurePointName;
	}

	@Override
	public String toString() {
		return "TestVO [measurePointName=" + measurePointName + "]";
	}
	
}
