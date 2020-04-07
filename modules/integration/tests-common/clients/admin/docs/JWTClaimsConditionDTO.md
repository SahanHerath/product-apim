
# JWTClaimsConditionDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Type of the thottling condition. Allowed values are HeaderCondition, IPCondition, JWTClaimsCondition, QueryParameterCondition  | 
**invertCondition** | **Boolean** | Specifies whether inversion of the condition to be matched against the request.  **Note:** When you add conditional groups for advanced throttling policies, this paramater should have the same value (&#x60;true&#x60; or &#x60;false&#x60;) for the same type of conditional group.  |  [optional]
**claimUrl** | **String** | JWT claim URL |  [optional]
**attribute** | **String** | Attribute to be matched |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
HEADERCONDITION | &quot;HeaderCondition&quot;
IPCONDITION | &quot;IPCondition&quot;
JWTCLAIMSCONDITION | &quot;JWTClaimsCondition&quot;
QUERYPARAMETERCONDITION | &quot;QueryParameterCondition&quot;



