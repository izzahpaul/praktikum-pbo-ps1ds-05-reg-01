package unguided;

import java.util.Comparator;

public class WaktuTrainingComparator implements Comparator<HasilEksperimen> {

    @Override
    public int compare(HasilEksperimen model1,
                       HasilEksperimen model2) {

        return Integer.compare(
                model1.getWaktuTraining(),
                model2.getWaktuTraining()
        );
    }
}
