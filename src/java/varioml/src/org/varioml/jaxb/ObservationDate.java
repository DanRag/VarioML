package org.varioml.jaxb;
import java.util.ArrayList;
import java.util.List;

@org.codehaus.jackson.annotate.JsonAutoDetect( fieldVisibility =  org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.NONE, getterVisibility= org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.NONE,setterVisibility= org.codehaus.jackson.annotate.JsonAutoDetect.Visibility.NONE)
@org.codehaus.jackson.map.annotate.JsonSerialize(include = org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion.NON_NULL)
@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
@javax.xml.bind.annotation.XmlRootElement(namespace="http://varioml.org/xml/1.0",name="observation_date")
@javax.xml.bind.annotation.XmlType(propOrder = {  "_dbXref","_comment"})
@org.codehaus.jackson.annotate.JsonPropertyOrder(value={  "_attr_coded","_attr_date","_dbXref","_comment"})


public class ObservationDate /**/implements VmlAnnotatable /**/ {
	//xml-element used for code generation: //lsdb/variant/observation_date

	public ObservationDate(  ) {
	}
 
	// ===========-- coded --===========
	@javax.xml.bind.annotation.XmlAttribute(required=false,name="coded")
	private Boolean _attr_coded ;
	public void setCoded( Boolean attr_coded) { 
		this._attr_coded = attr_coded ;
	}
	public Boolean isCoded() { 
		return this._attr_coded;
	}
 
	// ===========-- date --===========
	@javax.xml.bind.annotation.XmlAttribute(required=false,name="date")
	private org.varioml.util.VMLDate _attr_date ;
	public void setDate( org.varioml.util.VMLDate attr_date) { 
		this._attr_date = attr_date ;
	}
	public org.varioml.util.VMLDate getDate() { 
		return this._attr_date;
	}
 
	// ===========-- db_xref --===========
   @org.codehaus.jackson.annotate.JsonProperty("db_xrefs")
   @javax.xml.bind.annotation.XmlElement(required=false,name="db_xref",namespace="http://varioml.org/xml/1.0")
	private List<DbXref> _dbXref ;
	public void setDbXrefList( List<DbXref> dbXref) { 
		this._dbXref = dbXref ;
	}
	public List<DbXref> getDbXrefList()  { 
		return this._dbXref;
	}
	public void addDbXref(DbXref item ) { 
		if ( this._dbXref == null ) { 
			this._dbXref = new ArrayList<DbXref>();
		}
		this._dbXref.add( item);
	}
 
	// ===========-- comment --===========
   @org.codehaus.jackson.annotate.JsonProperty("comments")
   @javax.xml.bind.annotation.XmlElement(required=false,name="comment",namespace="http://varioml.org/xml/1.0")
	private List<Comment> _comment ;
	public void setCommentList( List<Comment> comment) { 
		this._comment = comment ;
	}
	public List<Comment> getCommentList()  { 
		return this._comment;
	}
	public void addComment(Comment item ) { 
		if ( this._comment == null ) { 
			this._comment = new ArrayList<Comment>();
		}
		this._comment.add( item);
	}
}