import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class ItemProcessor {
    @Inject
    private House house;

    public void execute() {
    house.plan();
    house.build();
    }




}