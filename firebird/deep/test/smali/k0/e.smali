.class public abstract Lk0/e;
.super Lk0/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lk0/c;"
    }
.end annotation


# instance fields
.field public final b:Landroid/app/Activity;

.field public final c:Landroid/content/Context;

.field public final d:Landroid/os/Handler;

.field public final e:I

.field public final f:Landroidx/fragment/app/e;


# direct methods
.method public constructor <init>(Lk0/b;)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 1
    invoke-direct {p0}, Lk0/c;-><init>()V

    new-instance v1, Landroidx/fragment/app/e;

    invoke-direct {v1}, Landroidx/fragment/app/e;-><init>()V

    iput-object v1, p0, Lk0/e;->f:Landroidx/fragment/app/e;

    iput-object p1, p0, Lk0/e;->b:Landroid/app/Activity;

    const-string v1, "context == null"

    invoke-static {p1, v1}, Lb/a;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lk0/e;->c:Landroid/content/Context;

    iput-object v0, p0, Lk0/e;->d:Landroid/os/Handler;

    const/4 p1, 0x0

    iput p1, p0, Lk0/e;->e:I

    return-void
.end method


# virtual methods
.method public e(I)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public g(Landroidx/fragment/app/Fragment;)V
    .locals 0

    return-void
.end method

.method public h(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public abstract i()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation
.end method

.method public j()Landroid/view/LayoutInflater;
    .locals 1

    iget-object v0, p0, Lk0/e;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method

.method public k()V
    .locals 0

    return-void
.end method
