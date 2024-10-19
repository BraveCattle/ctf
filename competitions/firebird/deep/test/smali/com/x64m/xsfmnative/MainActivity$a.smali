.class public Lcom/x64m/xsfmnative/MainActivity$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/x64m/xsfmnative/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/widget/RadioGroup;

.field public final synthetic c:Landroid/widget/EditText;

.field public final synthetic d:Landroid/widget/EditText;

.field public final synthetic e:Landroid/widget/TextView;

.field public final synthetic f:Lcom/x64m/xsfmnative/MainActivity;


# direct methods
.method public constructor <init>(Lcom/x64m/xsfmnative/MainActivity;Landroid/widget/RadioGroup;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/TextView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/x64m/xsfmnative/MainActivity$a;->f:Lcom/x64m/xsfmnative/MainActivity;

    iput-object p2, p0, Lcom/x64m/xsfmnative/MainActivity$a;->b:Landroid/widget/RadioGroup;

    iput-object p3, p0, Lcom/x64m/xsfmnative/MainActivity$a;->c:Landroid/widget/EditText;

    iput-object p4, p0, Lcom/x64m/xsfmnative/MainActivity$a;->d:Landroid/widget/EditText;

    iput-object p5, p0, Lcom/x64m/xsfmnative/MainActivity$a;->e:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/x64m/xsfmnative/MainActivity$a;->f:Lcom/x64m/xsfmnative/MainActivity;

    const-string v0, ""

    iput-object v0, p1, Lcom/x64m/xsfmnative/MainActivity;->o:Ljava/lang/String;

    iget-object p1, p0, Lcom/x64m/xsfmnative/MainActivity$a;->b:Landroid/widget/RadioGroup;

    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lcom/x64m/xsfmnative/MainActivity$a;->f:Lcom/x64m/xsfmnative/MainActivity;

    const-string v0, "INVALID OPERATION"

    goto :goto_0

    :pswitch_0
    iget-object p1, p0, Lcom/x64m/xsfmnative/MainActivity$a;->f:Lcom/x64m/xsfmnative/MainActivity;

    iget-object v0, p0, Lcom/x64m/xsfmnative/MainActivity$a;->c:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/x64m/xsfmnative/MainActivity$a;->d:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/x64m/xsfmnative/MainActivity;->jniSUB(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    iget-object p1, p0, Lcom/x64m/xsfmnative/MainActivity$a;->f:Lcom/x64m/xsfmnative/MainActivity;

    iget-object v0, p0, Lcom/x64m/xsfmnative/MainActivity$a;->c:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/x64m/xsfmnative/MainActivity$a;->d:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/x64m/xsfmnative/MainActivity;->jniMUL(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_2
    iget-object p1, p0, Lcom/x64m/xsfmnative/MainActivity$a;->f:Lcom/x64m/xsfmnative/MainActivity;

    iget-object v0, p0, Lcom/x64m/xsfmnative/MainActivity$a;->c:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/x64m/xsfmnative/MainActivity$a;->d:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/x64m/xsfmnative/MainActivity;->jniDIV(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_3
    iget-object p1, p0, Lcom/x64m/xsfmnative/MainActivity$a;->f:Lcom/x64m/xsfmnative/MainActivity;

    iget-object v0, p0, Lcom/x64m/xsfmnative/MainActivity$a;->c:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/x64m/xsfmnative/MainActivity$a;->d:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/x64m/xsfmnative/MainActivity;->jniADD(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p1, Lcom/x64m/xsfmnative/MainActivity;->o:Ljava/lang/String;

    iget-object p1, p0, Lcom/x64m/xsfmnative/MainActivity$a;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->clearComposingText()V

    iget-object p1, p0, Lcom/x64m/xsfmnative/MainActivity$a;->e:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/x64m/xsfmnative/MainActivity$a;->f:Lcom/x64m/xsfmnative/MainActivity;

    iget-object v0, v0, Lcom/x64m/xsfmnative/MainActivity;->o:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x7f0800d3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
