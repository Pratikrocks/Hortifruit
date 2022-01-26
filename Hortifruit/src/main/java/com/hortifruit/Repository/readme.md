# Jpa Repository

### Custom Repository
```aidl
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

```

### Farmers Repository
```aidl
@Repository
public interface FarmersRepository extends JpaRepository<Farmer, Long> {
}

```

### Farm Repository
```aidl
@Repository
public interface FarmRepository extends JpaRepository<Farm, Long> {
}
```
### Fruit Repository
```aidl
@Repository
public interface FruitRepository extends JpaRepository<Fruit, Long> {
}
```

### Marketplace Repository
```aidl
@Repository
public interface MarketplaceRepository extends JpaRepository<Marketplace, Long> {
}
```