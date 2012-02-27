package org.varioml.simplexml;
import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Root;

@Root(strict=true)

@org.simpleframework.xml.Order(elements={})
public class EmbargoEndDate {
	//xml-element used for code generation: //lsdb/individual/sharing_policy/embargo_end_date

	public EmbargoEndDate(  ) {
	}
 
	// ===========-- is_undefined --===========
	@org.simpleframework.xml.Attribute(required=false,name="is_undefined")
	private Boolean _attr_isUndefined ;
	public void setIsUndefinedAttr( Boolean attr_isUndefined) { 
		this._attr_isUndefined = attr_isUndefined ;
	}
	public Boolean getIsUndefinedAttr() { 
		return this._attr_isUndefined;
	}
	// =========-- TEXT NODE --=========
	@org.simpleframework.xml.Text(required=false)
	private org.varioml.util.VMLDate __vmldate ;
	public EmbargoEndDate( org.varioml.util.VMLDate v ) {
		this.__vmldate= v ;
	}
	public void setVMLDate( org.varioml.util.VMLDate v ) { 
		this.__vmldate= v ;
	}
	public org.varioml.util.VMLDate getVMLDate() {
		return this.__vmldate;
	}
}
