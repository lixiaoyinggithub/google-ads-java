// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/errors/criterion_error.proto

package com.google.ads.googleads.v0.errors;

public final class CriterionErrorProto {
  private CriterionErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_errors_CriterionErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_errors_CriterionErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v0/errors/criteri" +
      "on_error.proto\022\036google.ads.googleads.v0." +
      "errors\"\243\030\n\022CriterionErrorEnum\"\214\030\n\016Criter" +
      "ionError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\032" +
      "\n\026CONCRETE_TYPE_REQUIRED\020\002\022\035\n\031INVALID_EX" +
      "CLUDED_CATEGORY\020\003\022\030\n\024INVALID_KEYWORD_TEX" +
      "T\020\004\022\031\n\025KEYWORD_TEXT_TOO_LONG\020\005\022\036\n\032KEYWOR" +
      "D_HAS_TOO_MANY_WORDS\020\006\022\035\n\031KEYWORD_HAS_IN" +
      "VALID_CHARS\020\007\022\031\n\025INVALID_PLACEMENT_URL\020\010" +
      "\022\025\n\021INVALID_USER_LIST\020\t\022\031\n\025INVALID_USER_" +
      "INTEREST\020\n\022$\n INVALID_FORMAT_FOR_PLACEME" +
      "NT_URL\020\013\022\035\n\031PLACEMENT_URL_IS_TOO_LONG\020\014\022" +
      "\"\n\036PLACEMENT_URL_HAS_ILLEGAL_CHAR\020\r\022,\n(P" +
      "LACEMENT_URL_HAS_MULTIPLE_SITES_IN_LINE\020" +
      "\016\0229\n5PLACEMENT_IS_NOT_AVAILABLE_FOR_TARG" +
      "ETING_OR_EXCLUSION\020\017\022\031\n\025INVALID_VERTICAL" +
      "_PATH\020\020\022\036\n\032INVALID_YOUTUBE_CHANNEL_ID\020\021\022" +
      "\034\n\030INVALID_YOUTUBE_VIDEO_ID\020\022\022\'\n#YOUTUBE" +
      "_VERTICAL_CHANNEL_DEPRECATED\020\023\022*\n&YOUTUB" +
      "E_DEMOGRAPHIC_CHANNEL_DEPRECATED\020\024\022\033\n\027YO" +
      "UTUBE_URL_UNSUPPORTED\020\025\022 \n\034CANNOT_EXCLUD" +
      "E_CRITERIA_TYPE\020\026\022\034\n\030CANNOT_ADD_CRITERIA" +
      "_TYPE\020\027\022\032\n\026INVALID_PRODUCT_FILTER\020\030\022\033\n\027P" +
      "RODUCT_FILTER_TOO_LONG\020\031\022$\n CANNOT_EXCLU" +
      "DE_SIMILAR_USER_LIST\020\032\022\037\n\033CANNOT_ADD_CLO" +
      "SED_USER_LIST\020\033\022:\n6CANNOT_ADD_DISPLAY_ON" +
      "LY_LISTS_TO_SEARCH_ONLY_CAMPAIGNS\020\034\0225\n1C" +
      "ANNOT_ADD_DISPLAY_ONLY_LISTS_TO_SEARCH_C" +
      "AMPAIGNS\020\035\0227\n3CANNOT_ADD_DISPLAY_ONLY_LI" +
      "STS_TO_SHOPPING_CAMPAIGNS\020\036\0221\n-CANNOT_AD" +
      "D_USER_INTERESTS_TO_SEARCH_CAMPAIGNS\020\037\0229" +
      "\n5CANNOT_SET_BIDS_ON_CRITERION_TYPE_IN_S" +
      "EARCH_CAMPAIGNS\020 \0227\n3CANNOT_ADD_URLS_TO_" +
      "CRITERION_TYPE_FOR_CAMPAIGN_TYPE\020!\022\026\n\022IN" +
      "VALID_IP_ADDRESS\020\"\022\025\n\021INVALID_IP_FORMAT\020" +
      "#\022\026\n\022INVALID_MOBILE_APP\020$\022\037\n\033INVALID_MOB" +
      "ILE_APP_CATEGORY\020%\022\030\n\024INVALID_CRITERION_" +
      "ID\020&\022\033\n\027CANNOT_TARGET_CRITERION\020\'\022$\n CAN" +
      "NOT_TARGET_OBSOLETE_CRITERION\020(\022\"\n\036CRITE" +
      "RION_ID_AND_TYPE_MISMATCH\020)\022\034\n\030INVALID_P" +
      "ROXIMITY_RADIUS\020*\022\"\n\036INVALID_PROXIMITY_R" +
      "ADIUS_UNITS\020+\022 \n\034INVALID_STREETADDRESS_L" +
      "ENGTH\020,\022\033\n\027INVALID_CITYNAME_LENGTH\020-\022\035\n\031" +
      "INVALID_REGIONCODE_LENGTH\020.\022\035\n\031INVALID_R" +
      "EGIONNAME_LENGTH\020/\022\035\n\031INVALID_POSTALCODE" +
      "_LENGTH\0200\022\030\n\024INVALID_COUNTRY_CODE\0201\022\024\n\020I" +
      "NVALID_LATITUDE\0202\022\025\n\021INVALID_LONGITUDE\0203" +
      "\0226\n2PROXIMITY_GEOPOINT_AND_ADDRESS_BOTH_" +
      "CANNOT_BE_NULL\0204\022\035\n\031INVALID_PROXIMITY_AD" +
      "DRESS\0205\022\034\n\030INVALID_USER_DOMAIN_NAME\0206\022 \n" +
      "\034CRITERION_PARAMETER_TOO_LONG\0207\022&\n\"AD_SC" +
      "HEDULE_TIME_INTERVALS_OVERLAP\0208\0222\n.AD_SC" +
      "HEDULE_INTERVAL_CANNOT_SPAN_MULTIPLE_DAY" +
      "S\0209\022%\n!AD_SCHEDULE_INVALID_TIME_INTERVAL" +
      "\020:\0220\n,AD_SCHEDULE_EXCEEDED_INTERVALS_PER" +
      "_DAY_LIMIT\020;\022/\n+AD_SCHEDULE_CRITERION_ID" +
      "_MISMATCHING_FIELDS\020<\022$\n CANNOT_BID_MODI" +
      "FY_CRITERION_TYPE\020=\0222\n.CANNOT_BID_MODIFY" +
      "_CRITERION_CAMPAIGN_OPTED_OUT\020>\022(\n$CANNO" +
      "T_BID_MODIFY_NEGATIVE_CRITERION\020?\022\037\n\033BID" +
      "_MODIFIER_ALREADY_EXISTS\020@\022\027\n\023FEED_ID_NO" +
      "T_ALLOWED\020A\022(\n$ACCOUNT_INELIGIBLE_FOR_CR" +
      "ITERIA_TYPE\020B\022.\n*CRITERIA_TYPE_INVALID_F" +
      "OR_BIDDING_STRATEGY\020C\022\034\n\030CANNOT_EXCLUDE_" +
      "CRITERION\020D\022\033\n\027CANNOT_REMOVE_CRITERION\020E" +
      "\022\032\n\026PRODUCT_SCOPE_TOO_LONG\020F\022%\n!PRODUCT_" +
      "SCOPE_TOO_MANY_DIMENSIONS\020G\022\036\n\032PRODUCT_P" +
      "ARTITION_TOO_LONG\020H\022)\n%PRODUCT_PARTITION" +
      "_TOO_MANY_DIMENSIONS\020I\022\035\n\031INVALID_PRODUC" +
      "T_DIMENSION\020J\022\"\n\036INVALID_PRODUCT_DIMENSI" +
      "ON_TYPE\020K\022$\n INVALID_PRODUCT_BIDDING_CAT" +
      "EGORY\020L\022\034\n\030MISSING_SHOPPING_SETTING\020M\022\035\n" +
      "\031INVALID_MATCHING_FUNCTION\020N\022\037\n\033LOCATION" +
      "_FILTER_NOT_ALLOWED\020O\022\033\n\027LOCATION_FILTER" +
      "_INVALID\020P\0222\n.CANNOT_ATTACH_CRITERIA_AT_" +
      "CAMPAIGN_AND_ADGROUP\020Q\0229\n5HOTEL_LENGTH_O" +
      "F_STAY_OVERLAPS_WITH_EXISTING_CRITERION\020" +
      "R\022A\n=HOTEL_ADVANCE_BOOKING_WINDOW_OVERLA" +
      "PS_WITH_EXISTING_CRITERION\020S\022.\n*FIELD_IN" +
      "COMPATIBLE_WITH_NEGATIVE_TARGETING\020TB\311\001\n" +
      "\"com.google.ads.googleads.v0.errorsB\023Cri" +
      "terionErrorProtoP\001ZDgoogle.golang.org/ge" +
      "nproto/googleapis/ads/googleads/v0/error" +
      "s;errors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V0" +
      ".Errors\312\002\036Google\\Ads\\GoogleAds\\V0\\Errors" +
      "b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_google_ads_googleads_v0_errors_CriterionErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_errors_CriterionErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_errors_CriterionErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
