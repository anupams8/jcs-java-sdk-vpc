package com.jcs.sbs.model;

/**
 * This class is the parent class of all the Result model classes. It contains
 * the common properties present in the responses of all the operations of the
 * SDK.
 *
 */
public class JCSResult {
    private String requestId;
    private transient String xml;

    /**
     * Default constructor for JCSResult object.
     */
    public JCSResult() {
    }

    /**
     * Returns the ID of the request sent to the internal API.
     * 
     * @return The request ID that is returned by the internal API.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Used internally. It sets the requestId that was returned by the internal
     * API call.
     * 
     * @param requestId
     *            Value of <tt>requestId</tt> that was returned by the internal
     *            API call.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * All the Result classes are made from the corresponding Response classes
     * that are generated by JAXB after unmarshalling the response XML returned
     * by the internal API. This method returns the actual XML response that was
     * returned by the internal API.
     * 
     * @return The actual XML response that was returned by the internal API.
     */
    public String getXml() {
        return this.xml;
    }

    /**
     * All the Result classes are made from the corresponding Response classes
     * that are generated by JAXB after unmarshalling the response XML returned
     * by the internal API. This method is used internally to set the actual XML
     * response that was returned by the internal API.
     * 
     * @param xml
     *            The actual XML response that was returned by the internal API.
     */
    public void setXml(String xml) {
        this.xml = xml;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     * 
     * @return String representation of the object.
     */
    @Override
    public String toString() {
        return "JCSResult [requestId=" + requestId + ", xml=" + xml + "]";
    }

    /**
     * Returns hashCode value for object of this class.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((requestId == null) ? 0 : requestId.hashCode());
        result = prime * result + ((xml == null) ? 0 : xml.hashCode());
        return result;
    }

    /**
     * Returns true if another object is same as object of this class, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        JCSResult other = (JCSResult) obj;
        if (requestId == null) {
            if (other.requestId != null)
                return false;
        } else if (!requestId.equals(other.requestId))
            return false;
        if (xml == null) {
            if (other.xml != null)
                return false;
        } else if (!xml.equals(other.xml))
            return false;
        return true;
    }
    
    

}
