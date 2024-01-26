.class public Le0/s$g;
.super Le0/s$f;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le0/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# direct methods
.method public constructor <init>(Le0/s;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Le0/s$f;-><init>(Le0/s;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method public g(IIII)Le0/s;
    .locals 1

    iget-object v0, p0, Le0/s$d;->b:Landroid/view/WindowInsets;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/view/WindowInsets;->inset(IIII)Landroid/view/WindowInsets;

    move-result-object p1

    invoke-static {p1}, Le0/s;->h(Landroid/view/WindowInsets;)Le0/s;

    move-result-object p1

    return-object p1
.end method
