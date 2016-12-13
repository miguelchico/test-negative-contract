package contracts.external.rest

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/api/v1/xxxx'
    }
    response {
        status 409
        body([
               status: '409',
               message: 'CUSTOM_MESSAGE_HERE'
        ])
    }
}