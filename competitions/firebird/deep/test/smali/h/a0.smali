.class public Lh/a0;
.super Landroid/widget/ToggleButton;
.source ""


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x101004b

    .line 1
    invoke-direct {p0, p1, p2, v0}, Landroid/widget/ToggleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/widget/ToggleButton;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lh/p0;->a(Landroid/view/View;Landroid/content/Context;)V

    new-instance p1, Lh/x;

    invoke-direct {p1, p0}, Lh/x;-><init>(Landroid/widget/TextView;)V

    invoke-virtual {p1, p2, v0}, Lh/x;->e(Landroid/util/AttributeSet;I)V

    return-void
.end method
