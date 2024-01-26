.class public final Lf0/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;


# instance fields
.field public final a:Lf0/b;


# direct methods
.method public constructor <init>(Lf0/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/c;->a:Lf0/b;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lf0/c;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lf0/c;

    iget-object v0, p0, Lf0/c;->a:Lf0/b;

    iget-object p1, p1, Lf0/c;->a:Lf0/b;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lf0/c;->a:Lf0/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public onTouchExplorationStateChanged(Z)V
    .locals 1

    iget-object v0, p0, Lf0/c;->a:Lf0/b;

    check-cast v0, Lg1/d$a;

    .line 1
    iget-object v0, v0, Lg1/d$a;->a:Lg1/d;

    invoke-static {v0, p1}, Lg1/d;->a(Lg1/d;Z)V

    return-void
.end method
