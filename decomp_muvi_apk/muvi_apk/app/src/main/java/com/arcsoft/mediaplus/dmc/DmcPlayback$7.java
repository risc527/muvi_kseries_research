// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arcsoft.mediaplus.dmc;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.arcsoft.mediaplus.dmc:
//            DmcPlayback

class this._cls0
    implements android.widget.ItemClickListener
{

    final DmcPlayback this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        playFromIndex(i);
    }

    stener()
    {
        this$0 = DmcPlayback.this;
        super();
    }
}
