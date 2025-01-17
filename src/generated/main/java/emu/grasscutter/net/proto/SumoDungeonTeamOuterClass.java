// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SumoDungeonTeam.proto

package emu.grasscutter.net.proto;

public final class SumoDungeonTeamOuterClass {
  private SumoDungeonTeamOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SumoDungeonTeamOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SumoDungeonTeam)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
     */
    java.util.List<emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar> 
        getDungeonAvatarListList();
    /**
     * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
     */
    emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar getDungeonAvatarList(int index);
    /**
     * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
     */
    int getDungeonAvatarListCount();
    /**
     * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatarOrBuilder> 
        getDungeonAvatarListOrBuilderList();
    /**
     * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
     */
    emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatarOrBuilder getDungeonAvatarListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Obf: CCPMFPOAEIL
   * </pre>
   *
   * Protobuf type {@code SumoDungeonTeam}
   */
  public static final class SumoDungeonTeam extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SumoDungeonTeam)
      SumoDungeonTeamOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SumoDungeonTeam.newBuilder() to construct.
    private SumoDungeonTeam(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SumoDungeonTeam() {
      dungeonAvatarList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SumoDungeonTeam();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SumoDungeonTeam(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                dungeonAvatarList_ = new java.util.ArrayList<emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar>();
                mutable_bitField0_ |= 0x00000001;
              }
              dungeonAvatarList_.add(
                  input.readMessage(emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          dungeonAvatarList_ = java.util.Collections.unmodifiableList(dungeonAvatarList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.internal_static_SumoDungeonTeam_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.internal_static_SumoDungeonTeam_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam.class, emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam.Builder.class);
    }

    public static final int DUNGEON_AVATAR_LIST_FIELD_NUMBER = 1;
    private java.util.List<emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar> dungeonAvatarList_;
    /**
     * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar> getDungeonAvatarListList() {
      return dungeonAvatarList_;
    }
    /**
     * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatarOrBuilder> 
        getDungeonAvatarListOrBuilderList() {
      return dungeonAvatarList_;
    }
    /**
     * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
     */
    @java.lang.Override
    public int getDungeonAvatarListCount() {
      return dungeonAvatarList_.size();
    }
    /**
     * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar getDungeonAvatarList(int index) {
      return dungeonAvatarList_.get(index);
    }
    /**
     * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatarOrBuilder getDungeonAvatarListOrBuilder(
        int index) {
      return dungeonAvatarList_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < dungeonAvatarList_.size(); i++) {
        output.writeMessage(1, dungeonAvatarList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < dungeonAvatarList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, dungeonAvatarList_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam other = (emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam) obj;

      if (!getDungeonAvatarListList()
          .equals(other.getDungeonAvatarListList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getDungeonAvatarListCount() > 0) {
        hash = (37 * hash) + DUNGEON_AVATAR_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getDungeonAvatarListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Obf: CCPMFPOAEIL
     * </pre>
     *
     * Protobuf type {@code SumoDungeonTeam}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SumoDungeonTeam)
        emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeamOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.internal_static_SumoDungeonTeam_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.internal_static_SumoDungeonTeam_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam.class, emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getDungeonAvatarListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (dungeonAvatarListBuilder_ == null) {
          dungeonAvatarList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          dungeonAvatarListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.internal_static_SumoDungeonTeam_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam build() {
        emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam buildPartial() {
        emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam result = new emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam(this);
        int from_bitField0_ = bitField0_;
        if (dungeonAvatarListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            dungeonAvatarList_ = java.util.Collections.unmodifiableList(dungeonAvatarList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.dungeonAvatarList_ = dungeonAvatarList_;
        } else {
          result.dungeonAvatarList_ = dungeonAvatarListBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam) {
          return mergeFrom((emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam other) {
        if (other == emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam.getDefaultInstance()) return this;
        if (dungeonAvatarListBuilder_ == null) {
          if (!other.dungeonAvatarList_.isEmpty()) {
            if (dungeonAvatarList_.isEmpty()) {
              dungeonAvatarList_ = other.dungeonAvatarList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureDungeonAvatarListIsMutable();
              dungeonAvatarList_.addAll(other.dungeonAvatarList_);
            }
            onChanged();
          }
        } else {
          if (!other.dungeonAvatarList_.isEmpty()) {
            if (dungeonAvatarListBuilder_.isEmpty()) {
              dungeonAvatarListBuilder_.dispose();
              dungeonAvatarListBuilder_ = null;
              dungeonAvatarList_ = other.dungeonAvatarList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              dungeonAvatarListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getDungeonAvatarListFieldBuilder() : null;
            } else {
              dungeonAvatarListBuilder_.addAllMessages(other.dungeonAvatarList_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar> dungeonAvatarList_ =
        java.util.Collections.emptyList();
      private void ensureDungeonAvatarListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          dungeonAvatarList_ = new java.util.ArrayList<emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar>(dungeonAvatarList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar, emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar.Builder, emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatarOrBuilder> dungeonAvatarListBuilder_;

      /**
       * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar> getDungeonAvatarListList() {
        if (dungeonAvatarListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(dungeonAvatarList_);
        } else {
          return dungeonAvatarListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
       */
      public int getDungeonAvatarListCount() {
        if (dungeonAvatarListBuilder_ == null) {
          return dungeonAvatarList_.size();
        } else {
          return dungeonAvatarListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
       */
      public emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar getDungeonAvatarList(int index) {
        if (dungeonAvatarListBuilder_ == null) {
          return dungeonAvatarList_.get(index);
        } else {
          return dungeonAvatarListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
       */
      public Builder setDungeonAvatarList(
          int index, emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar value) {
        if (dungeonAvatarListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDungeonAvatarListIsMutable();
          dungeonAvatarList_.set(index, value);
          onChanged();
        } else {
          dungeonAvatarListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
       */
      public Builder setDungeonAvatarList(
          int index, emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar.Builder builderForValue) {
        if (dungeonAvatarListBuilder_ == null) {
          ensureDungeonAvatarListIsMutable();
          dungeonAvatarList_.set(index, builderForValue.build());
          onChanged();
        } else {
          dungeonAvatarListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
       */
      public Builder addDungeonAvatarList(emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar value) {
        if (dungeonAvatarListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDungeonAvatarListIsMutable();
          dungeonAvatarList_.add(value);
          onChanged();
        } else {
          dungeonAvatarListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
       */
      public Builder addDungeonAvatarList(
          int index, emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar value) {
        if (dungeonAvatarListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDungeonAvatarListIsMutable();
          dungeonAvatarList_.add(index, value);
          onChanged();
        } else {
          dungeonAvatarListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
       */
      public Builder addDungeonAvatarList(
          emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar.Builder builderForValue) {
        if (dungeonAvatarListBuilder_ == null) {
          ensureDungeonAvatarListIsMutable();
          dungeonAvatarList_.add(builderForValue.build());
          onChanged();
        } else {
          dungeonAvatarListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
       */
      public Builder addDungeonAvatarList(
          int index, emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar.Builder builderForValue) {
        if (dungeonAvatarListBuilder_ == null) {
          ensureDungeonAvatarListIsMutable();
          dungeonAvatarList_.add(index, builderForValue.build());
          onChanged();
        } else {
          dungeonAvatarListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
       */
      public Builder addAllDungeonAvatarList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar> values) {
        if (dungeonAvatarListBuilder_ == null) {
          ensureDungeonAvatarListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, dungeonAvatarList_);
          onChanged();
        } else {
          dungeonAvatarListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
       */
      public Builder clearDungeonAvatarList() {
        if (dungeonAvatarListBuilder_ == null) {
          dungeonAvatarList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          dungeonAvatarListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
       */
      public Builder removeDungeonAvatarList(int index) {
        if (dungeonAvatarListBuilder_ == null) {
          ensureDungeonAvatarListIsMutable();
          dungeonAvatarList_.remove(index);
          onChanged();
        } else {
          dungeonAvatarListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
       */
      public emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar.Builder getDungeonAvatarListBuilder(
          int index) {
        return getDungeonAvatarListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
       */
      public emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatarOrBuilder getDungeonAvatarListOrBuilder(
          int index) {
        if (dungeonAvatarListBuilder_ == null) {
          return dungeonAvatarList_.get(index);  } else {
          return dungeonAvatarListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatarOrBuilder> 
           getDungeonAvatarListOrBuilderList() {
        if (dungeonAvatarListBuilder_ != null) {
          return dungeonAvatarListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(dungeonAvatarList_);
        }
      }
      /**
       * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
       */
      public emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar.Builder addDungeonAvatarListBuilder() {
        return getDungeonAvatarListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar.getDefaultInstance());
      }
      /**
       * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
       */
      public emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar.Builder addDungeonAvatarListBuilder(
          int index) {
        return getDungeonAvatarListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar.getDefaultInstance());
      }
      /**
       * <code>repeated .SumoDungeonAvatar dungeon_avatar_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar.Builder> 
           getDungeonAvatarListBuilderList() {
        return getDungeonAvatarListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar, emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar.Builder, emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatarOrBuilder> 
          getDungeonAvatarListFieldBuilder() {
        if (dungeonAvatarListBuilder_ == null) {
          dungeonAvatarListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar, emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar.Builder, emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatarOrBuilder>(
                  dungeonAvatarList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          dungeonAvatarList_ = null;
        }
        return dungeonAvatarListBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SumoDungeonTeam)
    }

    // @@protoc_insertion_point(class_scope:SumoDungeonTeam)
    private static final emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam();
    }

    public static emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SumoDungeonTeam>
        PARSER = new com.google.protobuf.AbstractParser<SumoDungeonTeam>() {
      @java.lang.Override
      public SumoDungeonTeam parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SumoDungeonTeam(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SumoDungeonTeam> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SumoDungeonTeam> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SumoDungeonTeamOuterClass.SumoDungeonTeam getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SumoDungeonTeam_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SumoDungeonTeam_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025SumoDungeonTeam.proto\032\027SumoDungeonAvat" +
      "ar.proto\"B\n\017SumoDungeonTeam\022/\n\023dungeon_a" +
      "vatar_list\030\001 \003(\0132\022.SumoDungeonAvatarB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.getDescriptor(),
        });
    internal_static_SumoDungeonTeam_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SumoDungeonTeam_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SumoDungeonTeam_descriptor,
        new java.lang.String[] { "DungeonAvatarList", });
    emu.grasscutter.net.proto.SumoDungeonAvatarOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
