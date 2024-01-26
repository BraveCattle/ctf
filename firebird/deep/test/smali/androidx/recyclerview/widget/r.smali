.class public Landroidx/recyclerview/widget/r;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/r$a;,
        Landroidx/recyclerview/widget/r$b;
    }
.end annotation


# instance fields
.field public final a:Ll/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/a<",
            "Landroidx/recyclerview/widget/k$v;",
            "Landroidx/recyclerview/widget/r$a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ll/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll/e<",
            "Landroidx/recyclerview/widget/k$v;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ll/a;

    invoke-direct {v0}, Ll/a;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/r;->a:Ll/a;

    new-instance v0, Ll/e;

    invoke-direct {v0}, Ll/e;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/r;->b:Ll/e;

    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/k$v;)V
    .locals 6

    iget-object v0, p0, Landroidx/recyclerview/widget/r;->b:Ll/e;

    invoke-virtual {v0}, Ll/e;->g()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v2, p0, Landroidx/recyclerview/widget/r;->b:Ll/e;

    invoke-virtual {v2, v0}, Ll/e;->h(I)Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_0

    iget-object v2, p0, Landroidx/recyclerview/widget/r;->b:Ll/e;

    .line 1
    iget-object v3, v2, Ll/e;->c:[Ljava/lang/Object;

    aget-object v4, v3, v0

    sget-object v5, Ll/e;->e:Ljava/lang/Object;

    if-eq v4, v5, :cond_1

    aput-object v5, v3, v0

    iput-boolean v1, v2, Ll/e;->a:Z

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 2
    :cond_1
    :goto_1
    iget-object v0, p0, Landroidx/recyclerview/widget/r;->a:Ll/a;

    invoke-virtual {v0, p1}, Ll/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/r$a;

    if-eqz p1, :cond_2

    invoke-static {p1}, Landroidx/recyclerview/widget/r$a;->a(Landroidx/recyclerview/widget/r$a;)V

    :cond_2
    return-void
.end method
