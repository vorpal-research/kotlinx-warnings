package kotlinx.warnings

object Warnings { 
   const val NEW_INFERENCE_DIAGNOSTIC = "NEW_INFERENCE_DIAGNOSTIC" 
   const val EXPERIMENTAL_FEATURE_WARNING = "EXPERIMENTAL_FEATURE_WARNING" 
   const val EXTENSION_SHADOWED_BY_MEMBER = "EXTENSION_SHADOWED_BY_MEMBER" 
   const val EXTENSION_FUNCTION_SHADOWED_BY_INNER_CLASS_CONSTRUCTOR = "EXTENSION_FUNCTION_SHADOWED_BY_INNER_CLASS_CONSTRUCTOR" 
   const val EXTENSION_FUNCTION_SHADOWED_BY_MEMBER_PROPERTY_WITH_INVOKE = "EXTENSION_FUNCTION_SHADOWED_BY_MEMBER_PROPERTY_WITH_INVOKE" 
   const val DEPRECATION = "DEPRECATION" 
   const val TYPEALIAS_EXPANSION_DEPRECATION = "TYPEALIAS_EXPANSION_DEPRECATION" 
   const val VERSION_REQUIREMENT_DEPRECATION = "VERSION_REQUIREMENT_DEPRECATION" 
   const val DEPRECATED_ACCESS_BY_SHORT_NAME = "DEPRECATED_ACCESS_BY_SHORT_NAME" 
   const val EXPOSED_PROPERTY_TYPE_IN_CONSTRUCTOR = "EXPOSED_PROPERTY_TYPE_IN_CONSTRUCTOR" 
   const val INACCESSIBLE_TYPE = "INACCESSIBLE_TYPE" 
   const val PLATFORM_CLASS_MAPPED_TO_KOTLIN = "PLATFORM_CLASS_MAPPED_TO_KOTLIN" 
   const val REDUNDANT_NULLABLE = "REDUNDANT_NULLABLE" 
   const val REDUNDANT_PROJECTION = "REDUNDANT_PROJECTION" 
   const val FINITE_BOUNDS_VIOLATION_IN_JAVA = "FINITE_BOUNDS_VIOLATION_IN_JAVA" 
   const val EXPANSIVE_INHERITANCE_IN_JAVA = "EXPANSIVE_INHERITANCE_IN_JAVA" 
   const val INNER_CLASS_OF_GENERIC_THROWABLE_SUBCLASS_WARNING = "INNER_CLASS_OF_GENERIC_THROWABLE_SUBCLASS_WARNING" 
   const val DEPRECATED_MODIFIER_PAIR = "DEPRECATED_MODIFIER_PAIR" 
   const val REDUNDANT_MODIFIER = "REDUNDANT_MODIFIER" 
   const val DEPRECATED_MODIFIER_FOR_TARGET = "DEPRECATED_MODIFIER_FOR_TARGET" 
   const val DEPRECATED_MODIFIER = "DEPRECATED_MODIFIER" 
   const val REDUNDANT_MODIFIER_FOR_TARGET = "REDUNDANT_MODIFIER_FOR_TARGET" 
   const val DEPRECATED_MODIFIER_CONTAINING_DECLARATION = "DEPRECATED_MODIFIER_CONTAINING_DECLARATION" 
   const val REDUNDANT_INLINE_SUSPEND_FUNCTION_TYPE = "REDUNDANT_INLINE_SUSPEND_FUNCTION_TYPE" 
   const val WRONG_ANNOTATION_TARGET_WITH_USE_SITE_TARGET_ON_TYPE = "WRONG_ANNOTATION_TARGET_WITH_USE_SITE_TARGET_ON_TYPE" 
   const val REPEATED_ANNOTATION_WARNING = "REPEATED_ANNOTATION_WARNING" 
   const val ANNOTATION_ON_SUPERCLASS_WARNING = "ANNOTATION_ON_SUPERCLASS_WARNING" 
   const val ANNOTATION_ARGUMENT_KCLASS_LITERAL_OF_TYPE_PARAMETER = "ANNOTATION_ARGUMENT_KCLASS_LITERAL_OF_TYPE_PARAMETER" 
   const val ANNOTATIONS_ON_BLOCK_LEVEL_EXPRESSION_ON_THE_SAME_LINE = "ANNOTATIONS_ON_BLOCK_LEVEL_EXPRESSION_ON_THE_SAME_LINE" 
   const val ANNOTATION_ARGUMENT_IS_NON_CONST = "ANNOTATION_ARGUMENT_IS_NON_CONST" 
   const val RESTRICTED_RETENTION_FOR_EXPRESSION_ANNOTATION_WARNING = "RESTRICTED_RETENTION_FOR_EXPRESSION_ANNOTATION_WARNING" 
   const val LOCAL_ANNOTATION_CLASS = "LOCAL_ANNOTATION_CLASS" 
   const val NEWER_VERSION_IN_SINCE_KOTLIN = "NEWER_VERSION_IN_SINCE_KOTLIN" 
   const val EXPERIMENTAL_API_USAGE = "EXPERIMENTAL_API_USAGE" 
   const val EXPERIMENTAL_OVERRIDE = "EXPERIMENTAL_OVERRIDE" 
   const val EXPERIMENTAL_IS_NOT_ENABLED = "EXPERIMENTAL_IS_NOT_ENABLED" 
   const val USE_EXPERIMENTAL_WITHOUT_ARGUMENTS = "USE_EXPERIMENTAL_WITHOUT_ARGUMENTS" 
   const val USE_EXPERIMENTAL_ARGUMENT_IS_NOT_MARKER = "USE_EXPERIMENTAL_ARGUMENT_IS_NOT_MARKER" 
   const val EXPERIMENTAL_UNSIGNED_LITERALS = "EXPERIMENTAL_UNSIGNED_LITERALS" 
   const val REDUNDANT_ANNOTATION_TARGET = "REDUNDANT_ANNOTATION_TARGET" 
   const val CYCLIC_SCOPES_WITH_COMPANION = "CYCLIC_SCOPES_WITH_COMPANION" 
   const val DELEGATED_MEMBER_HIDES_SUPERTYPE_OVERRIDE = "DELEGATED_MEMBER_HIDES_SUPERTYPE_OVERRIDE" 
   const val REDUNDANT_OPEN_IN_INTERFACE = "REDUNDANT_OPEN_IN_INTERFACE" 
   const val TYPE_PARAMETERS_IN_ANONYMOUS_OBJECT = "TYPE_PARAMETERS_IN_ANONYMOUS_OBJECT" 
   const val FINAL_UPPER_BOUND = "FINAL_UPPER_BOUND" 
   const val MISPLACED_TYPE_PARAMETER_CONSTRAINTS = "MISPLACED_TYPE_PARAMETER_CONSTRAINTS" 
   const val NON_FINAL_MEMBER_IN_FINAL_CLASS = "NON_FINAL_MEMBER_IN_FINAL_CLASS" 
   const val NON_FINAL_MEMBER_IN_OBJECT = "NON_FINAL_MEMBER_IN_OBJECT" 
   const val DATA_CLASS_OVERRIDE_DEFAULT_VALUES_WARNING = "DATA_CLASS_OVERRIDE_DEFAULT_VALUES_WARNING" 
   const val REDUNDANT_MODIFIER_IN_GETTER = "REDUNDANT_MODIFIER_IN_GETTER" 
   const val UNNECESSARY_LATEINIT = "UNNECESSARY_LATEINIT" 
   const val NO_TAIL_CALLS_FOUND = "NO_TAIL_CALLS_FOUND" 
   const val USELESS_VARARG_ON_PARAMETER = "USELESS_VARARG_ON_PARAMETER" 
   const val PARAMETER_NAME_CHANGED_ON_OVERRIDE = "PARAMETER_NAME_CHANGED_ON_OVERRIDE" 
   const val DIFFERENT_NAMES_FOR_THE_SAME_PARAMETER_IN_SUPERTYPES = "DIFFERENT_NAMES_FOR_THE_SAME_PARAMETER_IN_SUPERTYPES" 
   const val NAME_SHADOWING = "NAME_SHADOWING" 
   const val ACCESSOR_PARAMETER_NAME_SHADOWING = "ACCESSOR_PARAMETER_NAME_SHADOWING" 
   const val ASSIGNING_SINGLE_ELEMENT_TO_VARARG_IN_NAMED_FORM_FUNCTION = "ASSIGNING_SINGLE_ELEMENT_TO_VARARG_IN_NAMED_FORM_FUNCTION" 
   const val ASSIGNING_SINGLE_ELEMENT_TO_VARARG_IN_NAMED_FORM_ANNOTATION = "ASSIGNING_SINGLE_ELEMENT_TO_VARARG_IN_NAMED_FORM_ANNOTATION" 
   const val REDUNDANT_SPREAD_OPERATOR_IN_NAMED_FORM_IN_ANNOTATION = "REDUNDANT_SPREAD_OPERATOR_IN_NAMED_FORM_IN_ANNOTATION" 
   const val NON_TAIL_RECURSIVE_CALL = "NON_TAIL_RECURSIVE_CALL" 
   const val TAIL_RECURSION_IN_TRY_IS_NOT_SUPPORTED = "TAIL_RECURSION_IN_TRY_IS_NOT_SUPPORTED" 
   const val REIFIED_TYPE_UNSAFE_SUBSTITUTION = "REIFIED_TYPE_UNSAFE_SUBSTITUTION" 
   const val TYPE_ARGUMENTS_REDUNDANT_IN_SUPER_QUALIFIER = "TYPE_ARGUMENTS_REDUNDANT_IN_SUPER_QUALIFIER" 
   const val DEPRECATED_IDENTITY_EQUALS = "DEPRECATED_IDENTITY_EQUALS" 
   const val IMPLICIT_BOXING_IN_IDENTITY_EQUALS = "IMPLICIT_BOXING_IN_IDENTITY_EQUALS" 
   const val DEPRECATED_BINARY_MOD = "DEPRECATED_BINARY_MOD" 
   const val DEPRECATED_BINARY_MOD_AS_REM = "DEPRECATED_BINARY_MOD_AS_REM" 
   const val INCOMPATIBLE_ENUM_COMPARISON = "INCOMPATIBLE_ENUM_COMPARISON" 
   const val DELEGATE_PD_METHOD_NONE_APPLICABLE = "DELEGATE_PD_METHOD_NONE_APPLICABLE" 
   const val DSL_SCOPE_VIOLATION_WARNING = "DSL_SCOPE_VIOLATION_WARNING" 
   const val LABEL_NAME_CLASH = "LABEL_NAME_CLASH" 
   const val NOT_A_FUNCTION_LABEL_WARNING = "NOT_A_FUNCTION_LABEL_WARNING" 
   const val REDUNDANT_LABEL_WARNING = "REDUNDANT_LABEL_WARNING" 
   const val UNREACHABLE_CODE = "UNREACHABLE_CODE" 
   const val UNUSED_VARIABLE = "UNUSED_VARIABLE" 
   const val UNUSED_PARAMETER = "UNUSED_PARAMETER" 
   const val UNUSED_ANONYMOUS_PARAMETER = "UNUSED_ANONYMOUS_PARAMETER" 
   const val UNUSED_DESTRUCTURED_PARAMETER_ENTRY = "UNUSED_DESTRUCTURED_PARAMETER_ENTRY" 
   const val UNUSED_TYPEALIAS_PARAMETER = "UNUSED_TYPEALIAS_PARAMETER" 
   const val ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE = "ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE" 
   const val VARIABLE_WITH_REDUNDANT_INITIALIZER = "VARIABLE_WITH_REDUNDANT_INITIALIZER" 
   const val UNUSED_VALUE = "UNUSED_VALUE" 
   const val UNUSED_CHANGED_VALUE = "UNUSED_CHANGED_VALUE" 
   const val UNUSED_EXPRESSION = "UNUSED_EXPRESSION" 
   const val UNUSED_LAMBDA_EXPRESSION = "UNUSED_LAMBDA_EXPRESSION" 
   const val VAL_REASSIGNMENT_VIA_BACKING_FIELD = "VAL_REASSIGNMENT_VIA_BACKING_FIELD" 
   const val SENSELESS_COMPARISON = "SENSELESS_COMPARISON" 
   const val SENSELESS_NULL_IN_WHEN = "SENSELESS_NULL_IN_WHEN" 
   const val UNNECESSARY_SAFE_CALL = "UNNECESSARY_SAFE_CALL" 
   const val UNNECESSARY_NOT_NULL_ASSERTION = "UNNECESSARY_NOT_NULL_ASSERTION" 
   const val NOT_NULL_ASSERTION_ON_LAMBDA_EXPRESSION = "NOT_NULL_ASSERTION_ON_LAMBDA_EXPRESSION" 
   const val NOT_NULL_ASSERTION_ON_CALLABLE_REFERENCE = "NOT_NULL_ASSERTION_ON_CALLABLE_REFERENCE" 
   const val USELESS_ELVIS = "USELESS_ELVIS" 
   const val USELESS_ELVIS_RIGHT_IS_NULL = "USELESS_ELVIS_RIGHT_IS_NULL" 
   const val DIVISION_BY_ZERO = "DIVISION_BY_ZERO" 
   const val INTEGER_OVERFLOW = "INTEGER_OVERFLOW" 
   const val FLOAT_LITERAL_CONFORMS_INFINITY = "FLOAT_LITERAL_CONFORMS_INFINITY" 
   const val FLOAT_LITERAL_CONFORMS_ZERO = "FLOAT_LITERAL_CONFORMS_ZERO" 
   const val UNCHECKED_CAST = "UNCHECKED_CAST" 
   const val USELESS_CAST = "USELESS_CAST" 
   const val CAST_NEVER_SUCCEEDS = "CAST_NEVER_SUCCEEDS" 
   const val IMPLICIT_CAST_TO_ANY = "IMPLICIT_CAST_TO_ANY" 
   const val DEPRECATED_SMARTCAST = "DEPRECATED_SMARTCAST" 
   const val ALWAYS_NULL = "ALWAYS_NULL" 
   const val USELESS_NULLABLE_CHECK = "USELESS_NULLABLE_CHECK" 
   const val USELESS_IS_CHECK = "USELESS_IS_CHECK" 
   const val LOCAL_VARIABLE_WITH_TYPE_PARAMETERS_WARNING = "LOCAL_VARIABLE_WITH_TYPE_PARAMETERS_WARNING" 
   const val REDUNDANT_ELSE_IN_WHEN = "REDUNDANT_ELSE_IN_WHEN" 
   const val NON_EXHAUSTIVE_WHEN = "NON_EXHAUSTIVE_WHEN" 
   const val DUPLICATE_LABEL_IN_WHEN = "DUPLICATE_LABEL_IN_WHEN" 
   const val NESTED_CLASS_DEPRECATED = "NESTED_CLASS_DEPRECATED" 
   const val NOTHING_TO_INLINE = "NOTHING_TO_INLINE" 
   const val OVERRIDE_BY_INLINE = "OVERRIDE_BY_INLINE" 
   const val PROTECTED_CALL_FROM_PUBLIC_INLINE = "PROTECTED_CALL_FROM_PUBLIC_INLINE" 
   const val MODIFIER_FORM_FOR_NON_BUILT_IN_SUSPEND = "MODIFIER_FORM_FOR_NON_BUILT_IN_SUSPEND" 
   const val PLUGIN_WARNING = "PLUGIN_WARNING" 
}
