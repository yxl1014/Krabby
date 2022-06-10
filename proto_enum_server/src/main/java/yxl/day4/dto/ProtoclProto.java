// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protocl.proto

package yxl.day4.dto;

public final class ProtoclProto {
  private ProtoclProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ProtoclType}
   */
  public enum ProtoclType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     *空
     * </pre>
     *
     * <code>C2S_None = 0;</code>
     */
    C2S_None(0),
    /**
     * <pre>
     *拾取
     * </pre>
     *
     * <code>C2S_Pick = 1;</code>
     */
    C2S_Pick(1),
    /**
     * <pre>
     *收取返回
     * </pre>
     *
     * <code>S2C_Pick = 2;</code>
     */
    S2C_Pick(2),
    /**
     * <pre>
     *扔掉
     * </pre>
     *
     * <code>C2S_Throw = 3;</code>
     */
    C2S_Throw(3),
    /**
     * <pre>
     *扔掉返回
     * </pre>
     *
     * <code>S2C_Throw = 4;</code>
     */
    S2C_Throw(4),
    /**
     * <pre>
     *销毁
     * </pre>
     *
     * <code>C2S_Destroy = 5;</code>
     */
    C2S_Destroy(5),
    /**
     * <pre>
     *销毁返回
     * </pre>
     *
     * <code>S2C_Destroy = 6;</code>
     */
    S2C_Destroy(6),
    /**
     * <pre>
     *给别人
     * </pre>
     *
     * <code>C2S_Give = 7;</code>
     */
    C2S_Give(7),
    /**
     * <pre>
     *给别人返回
     * </pre>
     *
     * <code>S2C_Give = 8;</code>
     */
    S2C_Give(8),
    /**
     * <pre>
     *获取道具掉落信息
     * </pre>
     *
     * <code>C2S_Obtain = 9;</code>
     */
    C2S_Obtain(9),
    /**
     * <pre>
     *掉落信息返回
     * </pre>
     *
     * <code>S2C_Obtain = 10;</code>
     */
    S2C_Obtain(10),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     *空
     * </pre>
     *
     * <code>C2S_None = 0;</code>
     */
    public static final int C2S_None_VALUE = 0;
    /**
     * <pre>
     *拾取
     * </pre>
     *
     * <code>C2S_Pick = 1;</code>
     */
    public static final int C2S_Pick_VALUE = 1;
    /**
     * <pre>
     *收取返回
     * </pre>
     *
     * <code>S2C_Pick = 2;</code>
     */
    public static final int S2C_Pick_VALUE = 2;
    /**
     * <pre>
     *扔掉
     * </pre>
     *
     * <code>C2S_Throw = 3;</code>
     */
    public static final int C2S_Throw_VALUE = 3;
    /**
     * <pre>
     *扔掉返回
     * </pre>
     *
     * <code>S2C_Throw = 4;</code>
     */
    public static final int S2C_Throw_VALUE = 4;
    /**
     * <pre>
     *销毁
     * </pre>
     *
     * <code>C2S_Destroy = 5;</code>
     */
    public static final int C2S_Destroy_VALUE = 5;
    /**
     * <pre>
     *销毁返回
     * </pre>
     *
     * <code>S2C_Destroy = 6;</code>
     */
    public static final int S2C_Destroy_VALUE = 6;
    /**
     * <pre>
     *给别人
     * </pre>
     *
     * <code>C2S_Give = 7;</code>
     */
    public static final int C2S_Give_VALUE = 7;
    /**
     * <pre>
     *给别人返回
     * </pre>
     *
     * <code>S2C_Give = 8;</code>
     */
    public static final int S2C_Give_VALUE = 8;
    /**
     * <pre>
     *获取道具掉落信息
     * </pre>
     *
     * <code>C2S_Obtain = 9;</code>
     */
    public static final int C2S_Obtain_VALUE = 9;
    /**
     * <pre>
     *掉落信息返回
     * </pre>
     *
     * <code>S2C_Obtain = 10;</code>
     */
    public static final int S2C_Obtain_VALUE = 10;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static ProtoclType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ProtoclType forNumber(int value) {
      switch (value) {
        case 0: return C2S_None;
        case 1: return C2S_Pick;
        case 2: return S2C_Pick;
        case 3: return C2S_Throw;
        case 4: return S2C_Throw;
        case 5: return C2S_Destroy;
        case 6: return S2C_Destroy;
        case 7: return C2S_Give;
        case 8: return S2C_Give;
        case 9: return C2S_Obtain;
        case 10: return S2C_Obtain;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ProtoclType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ProtoclType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ProtoclType>() {
            public ProtoclType findValueByNumber(int number) {
              return ProtoclType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return ProtoclProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final ProtoclType[] VALUES = values();

    public static ProtoclType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ProtoclType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ProtoclType)
  }

  public interface protoclOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocl)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *协议类型
     * </pre>
     *
     * <code>.ProtoclType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <pre>
     *协议类型
     * </pre>
     *
     * <code>.ProtoclType type = 1;</code>
     * @return The type.
     */
    ProtoclType getType();

    /**
     * <pre>
     *物品id
     * </pre>
     *
     * <code>int32 id = 2;</code>
     * @return The id.
     */
    int getId();

    /**
     * <pre>
     *用户id
     * </pre>
     *
     * <code>int32 uid = 3;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <pre>
     *返回状态
     * </pre>
     *
     * <code>bool status = 4;</code>
     * @return The status.
     */
    boolean getStatus();

    /**
     * <pre>
     *数据 道具数据或者错误信息。
     * </pre>
     *
     * <code>string proJson = 5;</code>
     * @return The proJson.
     */
    String getProJson();
    /**
     * <pre>
     *数据 道具数据或者错误信息。
     * </pre>
     *
     * <code>string proJson = 5;</code>
     * @return The bytes for proJson.
     */
    com.google.protobuf.ByteString
        getProJsonBytes();

    /**
     * <pre>
     *给予用户id
     * </pre>
     *
     * <code>int32 guid = 6;</code>
     * @return The guid.
     */
    int getGuid();
  }
  /**
   * Protobuf type {@code protocl}
   */
  public static final class protocl extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protocl)
      protoclOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use protocl.newBuilder() to construct.
    private protocl(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private protocl() {
      type_ = 0;
      proJson_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new protocl();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private protocl(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 16: {

              id_ = input.readInt32();
              break;
            }
            case 24: {

              uid_ = input.readInt32();
              break;
            }
            case 32: {

              status_ = input.readBool();
              break;
            }
            case 42: {
              String s = input.readStringRequireUtf8();

              proJson_ = s;
              break;
            }
            case 48: {

              guid_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ProtoclProto.internal_static_protocl_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ProtoclProto.internal_static_protocl_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protocl.class, Builder.class);
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <pre>
     *协议类型
     * </pre>
     *
     * <code>.ProtoclType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     *协议类型
     * </pre>
     *
     * <code>.ProtoclType type = 1;</code>
     * @return The type.
     */
    @Override public ProtoclType getType() {
      @SuppressWarnings("deprecation")
      ProtoclType result = ProtoclType.valueOf(type_);
      return result == null ? ProtoclType.UNRECOGNIZED : result;
    }

    public static final int ID_FIELD_NUMBER = 2;
    private int id_;
    /**
     * <pre>
     *物品id
     * </pre>
     *
     * <code>int32 id = 2;</code>
     * @return The id.
     */
    @Override
    public int getId() {
      return id_;
    }

    public static final int UID_FIELD_NUMBER = 3;
    private int uid_;
    /**
     * <pre>
     *用户id
     * </pre>
     *
     * <code>int32 uid = 3;</code>
     * @return The uid.
     */
    @Override
    public int getUid() {
      return uid_;
    }

    public static final int STATUS_FIELD_NUMBER = 4;
    private boolean status_;
    /**
     * <pre>
     *返回状态
     * </pre>
     *
     * <code>bool status = 4;</code>
     * @return The status.
     */
    @Override
    public boolean getStatus() {
      return status_;
    }

    public static final int PROJSON_FIELD_NUMBER = 5;
    private volatile Object proJson_;
    /**
     * <pre>
     *数据 道具数据或者错误信息。
     * </pre>
     *
     * <code>string proJson = 5;</code>
     * @return The proJson.
     */
    @Override
    public String getProJson() {
      Object ref = proJson_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        proJson_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *数据 道具数据或者错误信息。
     * </pre>
     *
     * <code>string proJson = 5;</code>
     * @return The bytes for proJson.
     */
    @Override
    public com.google.protobuf.ByteString
        getProJsonBytes() {
      Object ref = proJson_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        proJson_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GUID_FIELD_NUMBER = 6;
    private int guid_;
    /**
     * <pre>
     *给予用户id
     * </pre>
     *
     * <code>int32 guid = 6;</code>
     * @return The guid.
     */
    @Override
    public int getGuid() {
      return guid_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (type_ != ProtoclType.C2S_None.getNumber()) {
        output.writeEnum(1, type_);
      }
      if (id_ != 0) {
        output.writeInt32(2, id_);
      }
      if (uid_ != 0) {
        output.writeInt32(3, uid_);
      }
      if (status_ != false) {
        output.writeBool(4, status_);
      }
      if (!getProJsonBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, proJson_);
      }
      if (guid_ != 0) {
        output.writeInt32(6, guid_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != ProtoclType.C2S_None.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, id_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, uid_);
      }
      if (status_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, status_);
      }
      if (!getProJsonBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, proJson_);
      }
      if (guid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, guid_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof protocl)) {
        return super.equals(obj);
      }
      protocl other = (protocl) obj;

      if (type_ != other.type_) return false;
      if (getId()
          != other.getId()) return false;
      if (getUid()
          != other.getUid()) return false;
      if (getStatus()
          != other.getStatus()) return false;
      if (!getProJson()
          .equals(other.getProJson())) return false;
      if (getGuid()
          != other.getGuid()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getStatus());
      hash = (37 * hash) + PROJSON_FIELD_NUMBER;
      hash = (53 * hash) + getProJson().hashCode();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + getGuid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static protocl parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protocl parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protocl parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protocl parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protocl parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protocl parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protocl parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static protocl parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static protocl parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static protocl parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static protocl parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static protocl parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(protocl prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocl}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protocl)
        protoclOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ProtoclProto.internal_static_protocl_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ProtoclProto.internal_static_protocl_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protocl.class, Builder.class);
      }

      // Construct using yxl.day4.dto.ProtoclProto.protocl.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        type_ = 0;

        id_ = 0;

        uid_ = 0;

        status_ = false;

        proJson_ = "";

        guid_ = 0;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ProtoclProto.internal_static_protocl_descriptor;
      }

      @Override
      public protocl getDefaultInstanceForType() {
        return protocl.getDefaultInstance();
      }

      @Override
      public protocl build() {
        protocl result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public protocl buildPartial() {
        protocl result = new protocl(this);
        result.type_ = type_;
        result.id_ = id_;
        result.uid_ = uid_;
        result.status_ = status_;
        result.proJson_ = proJson_;
        result.guid_ = guid_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof protocl) {
          return mergeFrom((protocl)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protocl other) {
        if (other == protocl.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getStatus() != false) {
          setStatus(other.getStatus());
        }
        if (!other.getProJson().isEmpty()) {
          proJson_ = other.proJson_;
          onChanged();
        }
        if (other.getGuid() != 0) {
          setGuid(other.getGuid());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        protocl parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protocl) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int type_ = 0;
      /**
       * <pre>
       *协议类型
       * </pre>
       *
       * <code>.ProtoclType type = 1;</code>
       * @return The enum numeric value on the wire for type.
       */
      @Override public int getTypeValue() {
        return type_;
      }
      /**
       * <pre>
       *协议类型
       * </pre>
       *
       * <code>.ProtoclType type = 1;</code>
       * @param value The enum numeric value on the wire for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeValue(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *协议类型
       * </pre>
       *
       * <code>.ProtoclType type = 1;</code>
       * @return The type.
       */
      @Override
      public ProtoclType getType() {
        @SuppressWarnings("deprecation")
        ProtoclType result = ProtoclType.valueOf(type_);
        return result == null ? ProtoclType.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       *协议类型
       * </pre>
       *
       * <code>.ProtoclType type = 1;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(ProtoclType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *协议类型
       * </pre>
       *
       * <code>.ProtoclType type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <pre>
       *物品id
       * </pre>
       *
       * <code>int32 id = 2;</code>
       * @return The id.
       */
      @Override
      public int getId() {
        return id_;
      }
      /**
       * <pre>
       *物品id
       * </pre>
       *
       * <code>int32 id = 2;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *物品id
       * </pre>
       *
       * <code>int32 id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <pre>
       *用户id
       * </pre>
       *
       * <code>int32 uid = 3;</code>
       * @return The uid.
       */
      @Override
      public int getUid() {
        return uid_;
      }
      /**
       * <pre>
       *用户id
       * </pre>
       *
       * <code>int32 uid = 3;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *用户id
       * </pre>
       *
       * <code>int32 uid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private boolean status_ ;
      /**
       * <pre>
       *返回状态
       * </pre>
       *
       * <code>bool status = 4;</code>
       * @return The status.
       */
      @Override
      public boolean getStatus() {
        return status_;
      }
      /**
       * <pre>
       *返回状态
       * </pre>
       *
       * <code>bool status = 4;</code>
       * @param value The status to set.
       * @return This builder for chaining.
       */
      public Builder setStatus(boolean value) {
        
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *返回状态
       * </pre>
       *
       * <code>bool status = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearStatus() {
        
        status_ = false;
        onChanged();
        return this;
      }

      private Object proJson_ = "";
      /**
       * <pre>
       *数据 道具数据或者错误信息。
       * </pre>
       *
       * <code>string proJson = 5;</code>
       * @return The proJson.
       */
      public String getProJson() {
        Object ref = proJson_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          proJson_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <pre>
       *数据 道具数据或者错误信息。
       * </pre>
       *
       * <code>string proJson = 5;</code>
       * @return The bytes for proJson.
       */
      public com.google.protobuf.ByteString
          getProJsonBytes() {
        Object ref = proJson_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          proJson_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *数据 道具数据或者错误信息。
       * </pre>
       *
       * <code>string proJson = 5;</code>
       * @param value The proJson to set.
       * @return This builder for chaining.
       */
      public Builder setProJson(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        proJson_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *数据 道具数据或者错误信息。
       * </pre>
       *
       * <code>string proJson = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearProJson() {
        
        proJson_ = getDefaultInstance().getProJson();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *数据 道具数据或者错误信息。
       * </pre>
       *
       * <code>string proJson = 5;</code>
       * @param value The bytes for proJson to set.
       * @return This builder for chaining.
       */
      public Builder setProJsonBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        proJson_ = value;
        onChanged();
        return this;
      }

      private int guid_ ;
      /**
       * <pre>
       *给予用户id
       * </pre>
       *
       * <code>int32 guid = 6;</code>
       * @return The guid.
       */
      @Override
      public int getGuid() {
        return guid_;
      }
      /**
       * <pre>
       *给予用户id
       * </pre>
       *
       * <code>int32 guid = 6;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(int value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *给予用户id
       * </pre>
       *
       * <code>int32 guid = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:protocl)
    }

    // @@protoc_insertion_point(class_scope:protocl)
    private static final protocl DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new protocl();
    }

    public static protocl getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<protocl>
        PARSER = new com.google.protobuf.AbstractParser<protocl>() {
      @Override
      public protocl parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new protocl(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<protocl> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<protocl> getParserForType() {
      return PARSER;
    }

    @Override
    public protocl getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocl_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocl_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rprotocl.proto\"m\n\007protocl\022\032\n\004type\030\001 \001(\016" +
      "2\014.ProtoclType\022\n\n\002id\030\002 \001(\005\022\013\n\003uid\030\003 \001(\005\022" +
      "\016\n\006status\030\004 \001(\010\022\017\n\007proJson\030\005 \001(\t\022\014\n\004guid" +
      "\030\006 \001(\005*\263\001\n\013ProtoclType\022\014\n\010C2S_None\020\000\022\014\n\010" +
      "C2S_Pick\020\001\022\014\n\010S2C_Pick\020\002\022\r\n\tC2S_Throw\020\003\022" +
      "\r\n\tS2C_Throw\020\004\022\017\n\013C2S_Destroy\020\005\022\017\n\013S2C_D" +
      "estroy\020\006\022\014\n\010C2S_Give\020\007\022\014\n\010S2C_Give\020\010\022\016\n\n" +
      "C2S_Obtain\020\t\022\016\n\nS2C_Obtain\020\nB\034\n\014yxl.day4" +
      ".dtoB\014ProtoclProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_protocl_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protocl_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocl_descriptor,
        new String[] { "Type", "Id", "Uid", "Status", "ProJson", "Guid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
