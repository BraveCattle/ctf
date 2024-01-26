.class public Le0/s$f;
.super Le0/s$e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le0/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# direct methods
.method public constructor <init>(Le0/s;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Le0/s$e;-><init>(Le0/s;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method public a()Le0/s;
    .locals 1

    iget-object v0, p0, Le0/s$d;->b:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeDisplayCutout()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Le0/s;->h(Landroid/view/WindowInsets;)Le0/s;

    move-result-object v0

    return-object v0
.end method

.method public d()Le0/c;
    .locals 2

    iget-object v0, p0, Le0/s$d;->b:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getDisplayCutout()Landroid/view/DisplayCutout;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 1
    :cond_0
    new-instance v1, Le0/c;

    invoke-direct {v1, v0}, Le0/c;-><init>(Ljava/lang/Object;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Le0/s$f;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Le0/s$f;

    iget-object v0, p0, Le0/s$d;->b:Landroid/view/WindowInsets;

    iget-object p1, p1, Le0/s$d;->b:Landroid/view/WindowInsets;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Le0/s$d;->b:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->hashCode()I

    move-result v0

    return v0
.end method
