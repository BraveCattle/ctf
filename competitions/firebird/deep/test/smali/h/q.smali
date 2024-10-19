.class public Lh/q;
.super Landroid/widget/RadioButton;
.source ""


# instance fields
.field public final b:Lh/h;

.field public final c:Lh/d;

.field public final d:Lh/x;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lh/r0;->a(Landroid/content/Context;)Landroid/content/Context;

    const v0, 0x7f0301ef

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/RadioButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/widget/RadioButton;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lh/p0;->a(Landroid/view/View;Landroid/content/Context;)V

    new-instance p1, Lh/h;

    invoke-direct {p1, p0}, Lh/h;-><init>(Landroid/widget/CompoundButton;)V

    iput-object p1, p0, Lh/q;->b:Lh/h;

    invoke-virtual {p1, p2, v0}, Lh/h;->b(Landroid/util/AttributeSet;I)V

    new-instance p1, Lh/d;

    invoke-direct {p1, p0}, Lh/d;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lh/q;->c:Lh/d;

    invoke-virtual {p1, p2, v0}, Lh/d;->d(Landroid/util/AttributeSet;I)V

    new-instance p1, Lh/x;

    invoke-direct {p1, p0}, Lh/x;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Lh/q;->d:Lh/x;

    invoke-virtual {p1, p2, v0}, Lh/x;->e(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/CompoundButton;->drawableStateChanged()V

    iget-object v0, p0, Lh/q;->c:Lh/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh/d;->a()V

    :cond_0
    iget-object v0, p0, Lh/q;->d:Lh/x;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lh/x;->b()V

    :cond_1
    return-void
.end method

.method public getCompoundPaddingLeft()I
    .locals 1

    invoke-super {p0}, Landroid/widget/CompoundButton;->getCompoundPaddingLeft()I

    move-result v0

    return v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lh/q;->c:Lh/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh/d;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lh/q;->c:Lh/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lh/d;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportButtonTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lh/q;->b:Lh/h;

    if-eqz v0, :cond_0

    .line 1
    iget-object v0, v0, Lh/h;->b:Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportButtonTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lh/q;->b:Lh/h;

    if-eqz v0, :cond_0

    .line 1
    iget-object v0, v0, Lh/h;->c:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lh/q;->c:Lh/d;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lh/d;->e()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Lh/q;->c:Lh/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lh/d;->f(I)V

    :cond_0
    return-void
.end method

.method public setButtonDrawable(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/widget/RadioButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ld/a;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lh/q;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lh/q;->b:Lh/h;

    if-eqz p1, :cond_1

    .line 1
    iget-boolean v0, p1, Lh/h;->f:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p1, Lh/h;->f:Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p1, Lh/h;->f:Z

    invoke-virtual {p1}, Lh/h;->a()V

    :cond_1
    :goto_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lh/q;->c:Lh/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lh/d;->h(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lh/q;->c:Lh/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lh/d;->i(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportButtonTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lh/q;->b:Lh/h;

    if-eqz v0, :cond_0

    .line 1
    iput-object p1, v0, Lh/h;->b:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lh/h;->d:Z

    invoke-virtual {v0}, Lh/h;->a()V

    :cond_0
    return-void
.end method

.method public setSupportButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lh/q;->b:Lh/h;

    if-eqz v0, :cond_0

    .line 1
    iput-object p1, v0, Lh/h;->c:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    iput-boolean p1, v0, Lh/h;->e:Z

    invoke-virtual {v0}, Lh/h;->a()V

    :cond_0
    return-void
.end method
