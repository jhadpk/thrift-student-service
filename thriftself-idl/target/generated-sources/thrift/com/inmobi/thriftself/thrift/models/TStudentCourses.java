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

public class TStudentCourses implements org.apache.thrift.TBase<TStudentCourses, TStudentCourses._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TStudentCourses");

  private static final org.apache.thrift.protocol.TField INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("index", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField DEPARTMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("department", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SEMESTER_FIELD_DESC = new org.apache.thrift.protocol.TField("semester", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TStudentCoursesStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TStudentCoursesTupleSchemeFactory());
  }

  public int index; // required
  public String name; // required
  public String department; // required
  public int semester; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INDEX((short)1, "index"),
    NAME((short)2, "name"),
    DEPARTMENT((short)3, "department"),
    SEMESTER((short)4, "semester");

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
        case 1: // INDEX
          return INDEX;
        case 2: // NAME
          return NAME;
        case 3: // DEPARTMENT
          return DEPARTMENT;
        case 4: // SEMESTER
          return SEMESTER;
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
  private static final int __INDEX_ISSET_ID = 0;
  private static final int __SEMESTER_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INDEX, new org.apache.thrift.meta_data.FieldMetaData("index", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DEPARTMENT, new org.apache.thrift.meta_data.FieldMetaData("department", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEMESTER, new org.apache.thrift.meta_data.FieldMetaData("semester", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TStudentCourses.class, metaDataMap);
  }

  public TStudentCourses() {
  }

  public TStudentCourses(
    int index,
    String name,
    String department,
    int semester)
  {
    this();
    this.index = index;
    setIndexIsSet(true);
    this.name = name;
    this.department = department;
    this.semester = semester;
    setSemesterIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TStudentCourses(TStudentCourses other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.index = other.index;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetDepartment()) {
      this.department = other.department;
    }
    this.semester = other.semester;
  }

  public TStudentCourses deepCopy() {
    return new TStudentCourses(this);
  }

  @Override
  public void clear() {
    setIndexIsSet(false);
    this.index = 0;
    this.name = null;
    this.department = null;
    setSemesterIsSet(false);
    this.semester = 0;
  }

  public int getIndex() {
    return this.index;
  }

  public TStudentCourses setIndex(int index) {
    this.index = index;
    setIndexIsSet(true);
    return this;
  }

  public void unsetIndex() {
    __isset_bit_vector.clear(__INDEX_ISSET_ID);
  }

  /** Returns true if field index is set (has been assigned a value) and false otherwise */
  public boolean isSetIndex() {
    return __isset_bit_vector.get(__INDEX_ISSET_ID);
  }

  public void setIndexIsSet(boolean value) {
    __isset_bit_vector.set(__INDEX_ISSET_ID, value);
  }

  public String getName() {
    return this.name;
  }

  public TStudentCourses setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getDepartment() {
    return this.department;
  }

  public TStudentCourses setDepartment(String department) {
    this.department = department;
    return this;
  }

  public void unsetDepartment() {
    this.department = null;
  }

  /** Returns true if field department is set (has been assigned a value) and false otherwise */
  public boolean isSetDepartment() {
    return this.department != null;
  }

  public void setDepartmentIsSet(boolean value) {
    if (!value) {
      this.department = null;
    }
  }

  public int getSemester() {
    return this.semester;
  }

  public TStudentCourses setSemester(int semester) {
    this.semester = semester;
    setSemesterIsSet(true);
    return this;
  }

  public void unsetSemester() {
    __isset_bit_vector.clear(__SEMESTER_ISSET_ID);
  }

  /** Returns true if field semester is set (has been assigned a value) and false otherwise */
  public boolean isSetSemester() {
    return __isset_bit_vector.get(__SEMESTER_ISSET_ID);
  }

  public void setSemesterIsSet(boolean value) {
    __isset_bit_vector.set(__SEMESTER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INDEX:
      if (value == null) {
        unsetIndex();
      } else {
        setIndex((Integer)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case DEPARTMENT:
      if (value == null) {
        unsetDepartment();
      } else {
        setDepartment((String)value);
      }
      break;

    case SEMESTER:
      if (value == null) {
        unsetSemester();
      } else {
        setSemester((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INDEX:
      return Integer.valueOf(getIndex());

    case NAME:
      return getName();

    case DEPARTMENT:
      return getDepartment();

    case SEMESTER:
      return Integer.valueOf(getSemester());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INDEX:
      return isSetIndex();
    case NAME:
      return isSetName();
    case DEPARTMENT:
      return isSetDepartment();
    case SEMESTER:
      return isSetSemester();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TStudentCourses)
      return this.equals((TStudentCourses)that);
    return false;
  }

  public boolean equals(TStudentCourses that) {
    if (that == null)
      return false;

    boolean this_present_index = true;
    boolean that_present_index = true;
    if (this_present_index || that_present_index) {
      if (!(this_present_index && that_present_index))
        return false;
      if (this.index != that.index)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_department = true && this.isSetDepartment();
    boolean that_present_department = true && that.isSetDepartment();
    if (this_present_department || that_present_department) {
      if (!(this_present_department && that_present_department))
        return false;
      if (!this.department.equals(that.department))
        return false;
    }

    boolean this_present_semester = true;
    boolean that_present_semester = true;
    if (this_present_semester || that_present_semester) {
      if (!(this_present_semester && that_present_semester))
        return false;
      if (this.semester != that.semester)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TStudentCourses other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TStudentCourses typedOther = (TStudentCourses)other;

    lastComparison = Boolean.valueOf(isSetIndex()).compareTo(typedOther.isSetIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.index, typedOther.index);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDepartment()).compareTo(typedOther.isSetDepartment());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDepartment()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.department, typedOther.department);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSemester()).compareTo(typedOther.isSetSemester());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSemester()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.semester, typedOther.semester);
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
    StringBuilder sb = new StringBuilder("TStudentCourses(");
    boolean first = true;

    sb.append("index:");
    sb.append(this.index);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("department:");
    if (this.department == null) {
      sb.append("null");
    } else {
      sb.append(this.department);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("semester:");
    sb.append(this.semester);
    first = false;
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TStudentCoursesStandardSchemeFactory implements SchemeFactory {
    public TStudentCoursesStandardScheme getScheme() {
      return new TStudentCoursesStandardScheme();
    }
  }

  private static class TStudentCoursesStandardScheme extends StandardScheme<TStudentCourses> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TStudentCourses struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.index = iprot.readI32();
              struct.setIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DEPARTMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.department = iprot.readString();
              struct.setDepartmentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SEMESTER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.semester = iprot.readI32();
              struct.setSemesterIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TStudentCourses struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(INDEX_FIELD_DESC);
      oprot.writeI32(struct.index);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.department != null) {
        oprot.writeFieldBegin(DEPARTMENT_FIELD_DESC);
        oprot.writeString(struct.department);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SEMESTER_FIELD_DESC);
      oprot.writeI32(struct.semester);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TStudentCoursesTupleSchemeFactory implements SchemeFactory {
    public TStudentCoursesTupleScheme getScheme() {
      return new TStudentCoursesTupleScheme();
    }
  }

  private static class TStudentCoursesTupleScheme extends TupleScheme<TStudentCourses> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TStudentCourses struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetIndex()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetDepartment()) {
        optionals.set(2);
      }
      if (struct.isSetSemester()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetIndex()) {
        oprot.writeI32(struct.index);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetDepartment()) {
        oprot.writeString(struct.department);
      }
      if (struct.isSetSemester()) {
        oprot.writeI32(struct.semester);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TStudentCourses struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.index = iprot.readI32();
        struct.setIndexIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.department = iprot.readString();
        struct.setDepartmentIsSet(true);
      }
      if (incoming.get(3)) {
        struct.semester = iprot.readI32();
        struct.setSemesterIsSet(true);
      }
    }
  }

}

