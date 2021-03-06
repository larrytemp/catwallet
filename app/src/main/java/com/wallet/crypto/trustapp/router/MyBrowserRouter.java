package com.wallet.crypto.trustapp.router;

import android.content.Context;
import android.content.Intent;

import com.wallet.crypto.trustapp.ui.BrowserActivity;
import com.wallet.crypto.trustapp.ui.TransactionsActivity;

public class MyBrowserRouter {
    public void open(Context context, boolean isClearStack) {
        Intent intent = new Intent(context, BrowserActivity.class);
        if (isClearStack) {
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        }
        context.startActivity(intent);
    }
}
