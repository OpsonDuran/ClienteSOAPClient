/**
 * Cliente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.beeva.ClienteSOAP.ws;

public class Cliente  implements java.io.Serializable {
    private java.lang.String apellido;

    private int idCliente;

    private java.lang.String nombre;

    public Cliente() {
    }

    public Cliente(
           java.lang.String apellido,
           int idCliente,
           java.lang.String nombre) {
           this.apellido = apellido;
           this.idCliente = idCliente;
           this.nombre = nombre;
    }


    /**
     * Gets the apellido value for this Cliente.
     * 
     * @return apellido
     */
    public java.lang.String getApellido() {
        return apellido;
    }


    /**
     * Sets the apellido value for this Cliente.
     * 
     * @param apellido
     */
    public void setApellido(java.lang.String apellido) {
        this.apellido = apellido;
    }


    /**
     * Gets the idCliente value for this Cliente.
     * 
     * @return idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }


    /**
     * Sets the idCliente value for this Cliente.
     * 
     * @param idCliente
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }


    /**
     * Gets the nombre value for this Cliente.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Cliente.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cliente)) return false;
        Cliente other = (Cliente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apellido==null && other.getApellido()==null) || 
             (this.apellido!=null &&
              this.apellido.equals(other.getApellido()))) &&
            this.idCliente == other.getIdCliente() &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getApellido() != null) {
            _hashCode += getApellido().hashCode();
        }
        _hashCode += getIdCliente();
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cliente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.ClienteSOAP.beeva.com/", "cliente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apellido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
