.class public Lcom/x64m/xsfmnative/MainActivity;
.super Lc/c;
.source ""


# instance fields
.field public o:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "native-lib"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc/c;-><init>()V

    return-void
.end method


# virtual methods
.method public native jniADD(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public native jniDIV(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public native jniMUL(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public native jniSUB(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    invoke-super {p0, p1}, Lc/c;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b001c

    invoke-virtual {p0, p1}, Lc/c;->setContentView(I)V

    const p1, 0x7f0800bd

    invoke-virtual {p0, p1}, Lc/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Landroid/widget/EditText;

    const p1, 0x7f0800be

    invoke-virtual {p0, p1}, Lc/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Landroid/widget/EditText;

    const p1, 0x7f0800d1

    invoke-virtual {p0, p1}, Lc/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroid/widget/RadioGroup;

    const p1, 0x7f080046

    invoke-virtual {p0, p1}, Lc/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Landroid/widget/TextView;

    const p1, 0x7f0800b2

    invoke-virtual {p0, p1}, Lc/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const v0, 0x7f080054

    invoke-virtual {p0, v0}, Lc/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/Button;

    const-string v0, "firebird{0f_c0z_1_w1ll_n0t_put_7h3_fl4g_h3r3)}"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance p1, Lcom/x64m/xsfmnative/MainActivity$a;

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/x64m/xsfmnative/MainActivity$a;-><init>(Lcom/x64m/xsfmnative/MainActivity;Landroid/widget/RadioGroup;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/TextView;)V

    invoke-virtual {v6, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
