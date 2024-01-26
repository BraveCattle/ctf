.class public Lf/e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/view/ActionMode$Callback;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lf/e;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ll/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/h<",
            "Landroid/view/Menu;",
            "Landroid/view/Menu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf/e$a;->b:Landroid/content/Context;

    iput-object p2, p0, Lf/e$a;->a:Landroid/view/ActionMode$Callback;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lf/e$a;->c:Ljava/util/ArrayList;

    new-instance p1, Ll/h;

    invoke-direct {p1}, Ll/h;-><init>()V

    iput-object p1, p0, Lf/e$a;->d:Ll/h;

    return-void
.end method


# virtual methods
.method public a(Lf/a;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lf/e$a;->a:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lf/e$a;->e(Lf/a;)Landroid/view/ActionMode;

    move-result-object p1

    invoke-virtual {p0, p2}, Lf/e$a;->f(Landroid/view/Menu;)Landroid/view/Menu;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/view/ActionMode$Callback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public b(Lf/a;)V
    .locals 1

    iget-object v0, p0, Lf/e$a;->a:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lf/e$a;->e(Lf/a;)Landroid/view/ActionMode;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/view/ActionMode$Callback;->onDestroyActionMode(Landroid/view/ActionMode;)V

    return-void
.end method

.method public c(Lf/a;Landroid/view/MenuItem;)Z
    .locals 3

    iget-object v0, p0, Lf/e$a;->a:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lf/e$a;->e(Lf/a;)Landroid/view/ActionMode;

    move-result-object p1

    new-instance v1, Lg/c;

    iget-object v2, p0, Lf/e$a;->b:Landroid/content/Context;

    check-cast p2, Lz/b;

    invoke-direct {v1, v2, p2}, Lg/c;-><init>(Landroid/content/Context;Lz/b;)V

    invoke-interface {v0, p1, v1}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public d(Lf/a;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lf/e$a;->a:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lf/e$a;->e(Lf/a;)Landroid/view/ActionMode;

    move-result-object p1

    invoke-virtual {p0, p2}, Lf/e$a;->f(Landroid/view/Menu;)Landroid/view/Menu;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/view/ActionMode$Callback;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public e(Lf/a;)Landroid/view/ActionMode;
    .locals 4

    iget-object v0, p0, Lf/e$a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lf/e$a;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf/e;

    if-eqz v2, :cond_0

    iget-object v3, v2, Lf/e;->b:Lf/a;

    if-ne v3, p1, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lf/e;

    iget-object v1, p0, Lf/e$a;->b:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lf/e;-><init>(Landroid/content/Context;Lf/a;)V

    iget-object p1, p0, Lf/e$a;->c:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final f(Landroid/view/Menu;)Landroid/view/Menu;
    .locals 3

    iget-object v0, p0, Lf/e$a;->d:Ll/h;

    const/4 v1, 0x0

    .line 1
    invoke-virtual {v0, p1, v1}, Ll/h;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 2
    check-cast v0, Landroid/view/Menu;

    if-nez v0, :cond_0

    new-instance v0, Lg/e;

    iget-object v1, p0, Lf/e$a;->b:Landroid/content/Context;

    move-object v2, p1

    check-cast v2, Lz/a;

    invoke-direct {v0, v1, v2}, Lg/e;-><init>(Landroid/content/Context;Lz/a;)V

    iget-object v1, p0, Lf/e$a;->d:Ll/h;

    invoke-virtual {v1, p1, v0}, Ll/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method
