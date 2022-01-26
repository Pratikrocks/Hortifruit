# Controllers

### Customer Controller

```aidl
    @PostMapping("/customer") # POST for creating new customer
    public Customer customer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @GetMapping("/customer") # GET for getting all customers
    public List<Customer> customer() {
        return customerRepository.findAll();
    }

    @GetMapping("/customer/{id}") # GET for getting a customer by id
    public Customer customer(@PathVariable("id") Long id) {
        return customerRepository.findById(id).get();
    }

```


### Farmer Controller
```aidl
    @PostMapping("/farmer") # POST for creating new farmer
    public Farmer farmer(@RequestBody Farmer farmer) {
        return farmersRepository.save(farmer);
    }

    @GetMapping("/farmer") # GET for getting all farmers
    public List<Farmer> farmer() {
        return farmersRepository.findAll();
    }
```

### Fruit Controller

```aidl
    @PostMapping("/fruit") # POST for creating new fruit
    public Fruit fruit(@RequestBody Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @GetMapping("/fruit/{id}") # GET for getting a fruit by id
    public Fruit fruit(@PathVariable("id") Long id) {
        return fruitRepository.findById(id).orElseThrow(() -> new RuntimeException("Fruit with " + id +  " not found"));
    }

    @GetMapping("/fruit") # GET for getting all fruits
    public List<Fruit> fruits() {
        return fruitRepository.findAll();
    }
```

### Market Controller

```aidl
    @PostMapping("/marketplace") # POST for creating new market for buying and selling of fruits
    public Marketplace addMarketplace(@RequestBody Marketplace marketplace) {
        System.out.println(marketplace);
        return marketplaceRepository.save(marketplace);
    }

    @GetMapping("/marketplace") # GET for getting all markets
    public List<Marketplace> getMarketplaces() {
        return marketplaceRepository.findAll();
    }

    @GetMapping("/marketplace/{id}") # GET for getting a market by id
    public Marketplace getMarketplace(@PathVariable("id") Long id) {
        return marketplaceRepository.findById(id).get();
    }
```

