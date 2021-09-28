package net.jitsi.sdktest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import org.jitsi.meet.sdk.JitsiMeetActivity;
import org.jitsi.meet.sdk.JitsiMeetConferenceOptions;
import org.jitsi.meet.sdk.JitsiMeetView;

public class CustomJitsiMeetActivity extends JitsiMeetActivity {

    public static void launch(Context context, JitsiMeetConferenceOptions options) {
        Intent intent = new Intent(context, CustomJitsiMeetActivity.class);
        intent.setAction("org.jitsi.meet.CONFERENCE");
        intent.putExtra("JitsiMeetConferenceOptions", options);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    @Override
    protected JitsiMeetView getJitsiView() {
        return super.getJitsiView();
    }

    @Override
    protected void onUserLeaveHint() {

//        getJitsiView()
        //override to not get into picture-and-picture mode.
    }
}
