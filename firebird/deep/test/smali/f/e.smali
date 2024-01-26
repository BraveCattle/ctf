.class public Lf/e;
.super Landroid/view/ActionMode;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf/e$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lf/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lf/a;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/ActionMode;-><init>()V

    iput-object p1, p0, Lf/e;->a:Landroid/content/Context;

    iput-object p2, p0, Lf/e;->b:Lf/a;

    return-void
.end method


# virtual methods
.method public finish()V
    .locals 1

    iget-object v0, p0, Lf/e;->b:Lf/a;

    invoke-virtual {v0}, Lf/a;->c()V

    return-void
.end method

.method public getCustomView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lf/e;->b:Lf/a;

    invoke-virtual {v0}, Lf/a;->d()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 3

    new-instance v0, Lg/e;

    iget-object v1, p0, Lf/e;->a:Landroid/content/Context;

    iget-object v2, p0, Lf/e;->b:Lf/a;

    invoke-virtual {v2}, Lf/a;->e()Landroid/view/Menu;

    move-result-object v2

    check-cast v2, Lz/a;

    invoke-direct {v0, v1, v2}, Lg/e;-><init>(Landroid/content/Context;Lz/a;)V

    return-object v0
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    iget-object v0, p0, Lf/e;->b:Lf/a;

    invoke-virtual {v0}, Lf/a;->f()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lf/e;->b:Lf/a;

    invoke-virtual {v0}, Lf/a;->g()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTag()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf/e;->b:Lf/a;

    .line 1
    iget-object v0, v0, Lf/a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lf/e;->b:Lf/a;

    invoke-virtual {v0}, Lf/a;->h()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTitleOptionalHint()Z
    .locals 1

    iget-object v0, p0, Lf/e;->b:Lf/a;

    .line 1
    iget-boolean v0, v0, Lf/a;->c:Z

    return v0
.end method

.method public invalidate()V
    .locals 1

    iget-object v0, p0, Lf/e;->b:Lf/a;

    invoke-virtual {v0}, Lf/a;->i()V

    return-void
.end method

.method public isTitleOptional()Z
    .locals 1

    iget-object v0, p0, Lf/e;->b:Lf/a;

    invoke-virtual {v0}, Lf/a;->j()Z

    move-result v0

    return v0
.end method

.method public setCustomView(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lf/e;->b:Lf/a;

    invoke-virtual {v0, p1}, Lf/a;->k(Landroid/view/View;)V

    return-void
.end method

.method public setSubtitle(I)V
    .locals 1

    iget-object v0, p0, Lf/e;->b:Lf/a;

    invoke-virtual {v0, p1}, Lf/a;->l(I)V

    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lf/e;->b:Lf/a;

    invoke-virtual {v0, p1}, Lf/a;->m(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTag(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lf/e;->b:Lf/a;

    .line 1
    iput-object p1, v0, Lf/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public setTitle(I)V
    .locals 1

    iget-object v0, p0, Lf/e;->b:Lf/a;

    invoke-virtual {v0, p1}, Lf/a;->n(I)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lf/e;->b:Lf/a;

    invoke-virtual {v0, p1}, Lf/a;->o(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitleOptionalHint(Z)V
    .locals 1

    iget-object v0, p0, Lf/e;->b:Lf/a;

    invoke-virtual {v0, p1}, Lf/a;->p(Z)V

    return-void
.end method
