namespace java com.inmobi.thriftself.thrift.models
namespace py thriftself_thrift_models

exception TInternalServerException {
    1: required string message;
}

exception TError {
    1: string code,
    2: string message
}

exception TServiceException {
    1: optional set<TError> errors
}