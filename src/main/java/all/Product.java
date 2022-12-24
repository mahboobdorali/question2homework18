package all;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
@NoArgsConstructor
public class Product implements Subject {
    private List<Observer> observersList;
    private String productName;
    private String productType;
    private String availability;


    public Product(String productType,String productName,String availability) {
        this.productType=productType;
        this.productName = productName;
        this.availability=availability;
    }


    public void setObservers(ArrayList observers) {
        this.observersList = observers;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public void setAvailability(String availability) {
        this.availability = availability;
        notifyObservers();
    }

    @Override
    public void signUpObserver(Observer observer) {
        if (observersList.contains(observer)) {
            throw new RuntimeException("Observer exist.");
        } else observersList.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observersList) {
            observer.update(this.availability);
        }
    }
}
