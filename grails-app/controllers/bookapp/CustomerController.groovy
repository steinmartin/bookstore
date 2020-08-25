package bookapp

class CustomerController {
    static scaffold=Customer

    def calculationsService
    def index() {

    }
    def create(){
        [CustomerInstance: new Customer()]
    }
     def lookup(){
          def customerInstance=Customer.list()
         [customerInstancelist:customerInstance]
     }
    def checkin(){

    }
    def customerlookup(Customer lookupinstance){  //Lookupinstance contains all infos will be paste for the form

        def(customerInstance,welcomeMessage)= calculationsService.processCheckin(lookupinstance)
        render(view: "checkin",model:[customerInstance : customerInstance,welcomeMessage: welcomeMessage])
        //Query customer id
        // if no result
        //Create a new customer
        // Create a welcome message
        // Add bookapp record
        // Save Customer
        //Send welcome to the kiosk
        //if customer found
        //calculate Total point
        // Create a welcome message
        // Add bookapp record
        // Save Customer

    }
}
