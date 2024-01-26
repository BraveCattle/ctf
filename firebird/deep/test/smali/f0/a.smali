.class public final Lf0/a;
.super Landroid/text/style/ClickableSpan;
.source ""


# instance fields
.field public final a:I

.field public final b:Lf0/d;

.field public final c:I


# direct methods
.method public constructor <init>(ILf0/d;I)V
    .locals 0

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    iput p1, p0, Lf0/a;->a:I

    iput-object p2, p0, Lf0/a;->b:Lf0/d;

    iput p3, p0, Lf0/a;->c:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iget v0, p0, Lf0/a;->a:I

    const-string v1, "ACCESSIBILITY_CLICKABLE_SPAN_ID"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lf0/a;->b:Lf0/d;

    iget v1, p0, Lf0/a;->c:I

    .line 1
    iget-object v0, v0, Lf0/d;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, v1, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->performAction(ILandroid/os/Bundle;)Z

    return-void
.end method
