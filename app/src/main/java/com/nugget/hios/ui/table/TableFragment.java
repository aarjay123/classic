package com.nugget.hios.ui.table;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;

import com.nugget.hios.R;
import com.nugget.hios.databinding.FragmentTableBinding;
import com.nugget.hios.ui.table.TableViewModel;

public class TableFragment extends Fragment {

    private com.nugget.hios.ui.table.TableViewModel TableViewModel;
    private FragmentTableBinding binding;

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @SuppressLint("WrongConstant")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TableViewModel =
                new ViewModelProvider(this).get(TableViewModel.class);

        binding = FragmentTableBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        WebView webView = (WebView)root.findViewById(R.id.webView);

        webView.setInitialScale(1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        webView.setScrollbarFadingEnabled(false);

        webView.setWebViewClient(new WebViewClient()
        {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {
                //view.loadUrl(url);
                System.out.println("Never gonna give you up");
                return false;
            }
        });

        //webView.loadUrl("https://thehighlandcafe.github.io/hiosmobile/extras/main.html");
        webView.loadUrl("https://aarjay123.github.io/hiosmobile/welcome.html");

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
