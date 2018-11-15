/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.inmobi.thriftself.thrift.models;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TServiceException extends Exception implements org.apache.thrift.TBase<TServiceException, TServiceException._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TServiceException");

  private static final org.apache.thrift.protocol.TField ERRORS_FIELD_DESC = new org.apache.thrift.protocol.TField("errors", org.apache.thrift.protocol.TType.SET, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TServiceExceptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TServiceExceptionTupleSchemeFactory());
  }

  public Set<TError> errors; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERRORS((short)1, "errors");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ERRORS
          return ERRORS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.ERRORS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERRORS, new org.apache.thrift.meta_data.FieldMetaData("errors", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TServiceException.class, metaDataMap);
  }

  public TServiceException() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TServiceException(TServiceException other) {
    if (other.isSetErrors()) {
      Set<TError> __this__errors = new HashSet<TError>();
      for (TError other_element : other.errors) {
        __this__errors.add(new TError(other_element));
      }
      this.errors = __this__errors;
    }
  }

  public TServiceException deepCopy() {
    return new TServiceException(this);
  }

  @Override
  public void clear() {
    this.errors = null;
  }

  public int getErrorsSize() {
    return (this.errors == null) ? 0 : this.errors.size();
  }

  public java.util.Iterator<TError> getErrorsIterator() {
    return (this.errors == null) ? null : this.errors.iterator();
  }

  public void addToErrors(TError elem) {
    if (this.errors == null) {
      this.errors = new HashSet<TError>();
    }
    this.errors.add(elem);
  }

  public Set<TError> getErrors() {
    return this.errors;
  }

  public TServiceException setErrors(Set<TError> errors) {
    this.errors = errors;
    return this;
  }

  public void unsetErrors() {
    this.errors = null;
  }

  /** Returns true if field errors is set (has been assigned a value) and false otherwise */
  public boolean isSetErrors() {
    return this.errors != null;
  }

  public void setErrorsIsSet(boolean value) {
    if (!value) {
      this.errors = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ERRORS:
      if (value == null) {
        unsetErrors();
      } else {
        setErrors((Set<TError>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ERRORS:
      return getErrors();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ERRORS:
      return isSetErrors();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TServiceException)
      return this.equals((TServiceException)that);
    return false;
  }

  public boolean equals(TServiceException that) {
    if (that == null)
      return false;

    boolean this_present_errors = true && this.isSetErrors();
    boolean that_present_errors = true && that.isSetErrors();
    if (this_present_errors || that_present_errors) {
      if (!(this_present_errors && that_present_errors))
        return false;
      if (!this.errors.equals(that.errors))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TServiceException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TServiceException typedOther = (TServiceException)other;

    lastComparison = Boolean.valueOf(isSetErrors()).compareTo(typedOther.isSetErrors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrors()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errors, typedOther.errors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TServiceException(");
    boolean first = true;

    if (isSetErrors()) {
      sb.append("errors:");
      if (this.errors == null) {
        sb.append("null");
      } else {
        sb.append(this.errors);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TServiceExceptionStandardSchemeFactory implements SchemeFactory {
    public TServiceExceptionStandardScheme getScheme() {
      return new TServiceExceptionStandardScheme();
    }
  }

  private static class TServiceExceptionStandardScheme extends StandardScheme<TServiceException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TServiceException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERRORS
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set0 = iprot.readSetBegin();
                struct.errors = new HashSet<TError>(2*_set0.size);
                for (int _i1 = 0; _i1 < _set0.size; ++_i1)
                {
                  TError _elem2; // required
                  _elem2 = new TError();
                  _elem2.read(iprot);
                  struct.errors.add(_elem2);
                }
                iprot.readSetEnd();
              }
              struct.setErrorsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TServiceException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.errors != null) {
        if (struct.isSetErrors()) {
          oprot.writeFieldBegin(ERRORS_FIELD_DESC);
          {
            oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.errors.size()));
            for (TError _iter3 : struct.errors)
            {
              _iter3.write(oprot);
            }
            oprot.writeSetEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TServiceExceptionTupleSchemeFactory implements SchemeFactory {
    public TServiceExceptionTupleScheme getScheme() {
      return new TServiceExceptionTupleScheme();
    }
  }

  private static class TServiceExceptionTupleScheme extends TupleScheme<TServiceException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TServiceException struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetErrors()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetErrors()) {
        {
          oprot.writeI32(struct.errors.size());
          for (TError _iter4 : struct.errors)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TServiceException struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TSet _set5 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.errors = new HashSet<TError>(2*_set5.size);
          for (int _i6 = 0; _i6 < _set5.size; ++_i6)
          {
            TError _elem7; // required
            _elem7 = new TError();
            _elem7.read(iprot);
            struct.errors.add(_elem7);
          }
        }
        struct.setErrorsIsSet(true);
      }
    }
  }

}
