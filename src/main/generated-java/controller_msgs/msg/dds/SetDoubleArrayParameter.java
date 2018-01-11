package controller_msgs.msg.dds;

/**
 *
 * Definition of the class "SetDoubleArrayParameter" defined in SetDoubleArrayParameter_.idl.
 *
 * This file was automatically generated from SetDoubleArrayParameter_.idl by us.ihmc.idl.generator.IDLGenerator.
 * Do not update this file directly, edit SetDoubleArrayParameter_.idl instead.
 *
 */
public class SetDoubleArrayParameter
{
   public SetDoubleArrayParameter()
   {
      parameter_name_ = new java.lang.StringBuilder(255);
      parameter_value_ = new us.ihmc.idl.IDLSequence.Double(100, "type_6");

   }

   public void set(SetDoubleArrayParameter other)
   {
      parameter_name_.setLength(0);
      parameter_name_.append(other.parameter_name_);
      parameter_value_.set(other.parameter_value_);
   }

   public void setParameter_name(String parameter_name)
   {
      parameter_name_.setLength(0);
      parameter_name_.append(parameter_name);
   }

   public java.lang.String getParameter_nameAsString()
   {
      return getParameter_name().toString();
   }

   public java.lang.StringBuilder getParameter_name()
   {
      return parameter_name_;
   }

   public us.ihmc.idl.IDLSequence.Double getParameter_value()
   {
      return parameter_value_;
   }

   @Override
   public boolean equals(java.lang.Object other)
   {
      if (other == null)
         return false;
      if (other == this)
         return true;
      if (!(other instanceof SetDoubleArrayParameter))
         return false;
      SetDoubleArrayParameter otherMyClass = (SetDoubleArrayParameter) other;
      boolean returnedValue = true;

      returnedValue &= us.ihmc.idl.IDLTools.equals(this.parameter_name_, otherMyClass.parameter_name_);

      returnedValue &= this.parameter_value_.equals(otherMyClass.parameter_value_);

      return returnedValue;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("SetDoubleArrayParameter {");
      builder.append("parameter_name=");
      builder.append(this.parameter_name_);

      builder.append(", ");
      builder.append("parameter_value=");
      builder.append(this.parameter_value_);

      builder.append("}");
      return builder.toString();
   }

   private java.lang.StringBuilder parameter_name_;
   private us.ihmc.idl.IDLSequence.Double parameter_value_;

}