package contracts.external.rest

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/api/v1/xxxx'
    }
    response {
        status 200
        body([
               status: '200',
               list: []
        ])
    }
}