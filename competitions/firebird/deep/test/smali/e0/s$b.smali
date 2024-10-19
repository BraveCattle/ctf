.class public Le0/s$b;
.super Le0/s$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le0/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final b:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Le0/s$c;-><init>()V

    new-instance v0, Landroid/view/WindowInsets$Builder;

    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    iput-object v0, p0, Le0/s$b;->b:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(Le0/s;)V
    .locals 1

    invoke-direct {p0}, Le0/s$c;-><init>()V

    invoke-virtual {p1}, Le0/s;->g()Landroid/view/WindowInsets;

    move-result-object p1

    new-instance v0, Landroid/view/WindowInsets$Builder;

    if-eqz p1, :cond_0

    invoke-direct {v0, p1}, Landroid/view/WindowInsets$Builder;-><init>(Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_0
    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    :goto_0
    iput-object v0, p0, Le0/s$b;->b:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public a()Le0/s;
    .locals 1

    iget-object v0, p0, Le0/s$b;->b:Landroid/view/WindowInsets$Builder;

    invoke-virtual {v0}, Landroid/view/WindowInsets$Builder;->build()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Le0/s;->h(Landroid/view/WindowInsets;)Le0/s;

    move-result-object v0

    return-object v0
.end method

.method public b(Lx/b;)V
    .locals 4

    iget-object v0, p0, Le0/s$b;->b:Landroid/view/WindowInsets$Builder;

    .line 1
    iget v1, p1, Lx/b;->a:I

    iget v2, p1, Lx/b;->b:I

    iget v3, p1, Lx/b;->c:I

    iget p1, p1, Lx/b;->d:I

    invoke-static {v1, v2, v3, p1}, Landroid/graphics/Insets;->of(IIII)Landroid/graphics/Insets;

    move-result-object p1

    .line 2
    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setStableInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public c(Lx/b;)V
    .locals 4

    iget-object v0, p0, Le0/s$b;->b:Landroid/view/WindowInsets$Builder;

    .line 1
    iget v1, p1, Lx/b;->a:I

    iget v2, p1, Lx/b;->b:I

    iget v3, p1, Lx/b;->c:I

    iget p1, p1, Lx/b;->d:I

    invoke-static {v1, v2, v3, p1}, Landroid/graphics/Insets;->of(IIII)Landroid/graphics/Insets;

    move-result-object p1

    .line 2
    invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemWindowInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;

    return-void
.end method
