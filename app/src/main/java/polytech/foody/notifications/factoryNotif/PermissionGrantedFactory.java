package polytech.foody.notifications.factoryNotif;

import android.content.Context;

import polytech.foody.GpsTest;
import polytech.foody.notifications.PermissionGranted;
import polytech.foody.notifications.PermissionNotGranted;

public class PermissionGrantedFactory extends AbstractFactoryNotif{
    @Override
    public PermissionNotGranted buildNotGranted(Context context, String title) {
        return null;
    }

    @Override
    public PermissionGranted buildGranted(Context context, String title) {
        return new PermissionGranted(context, title);
    }
}
